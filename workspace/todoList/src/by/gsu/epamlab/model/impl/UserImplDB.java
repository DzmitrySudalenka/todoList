package by.gsu.epamlab.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.ifaces.IUserDAO;
import by.gsu.epamlab.model.beans.UserRole;
import by.gsu.epamlab.model.beans.User;
import by.gsu.epamlab.utils.DBManager;

public class UserImplDB implements IUserDAO {
	public User getUser(String login, String password) throws DaoException {
		final int INDEX_LOGIN = 1, INDEX_USER_ID = 1, INDEX_ROLE_ID = 2, 
				INDEX_PASSWORD = 3;
		Connection cn = null;
		PreparedStatement psSelectUser = null;
		ResultSet rs = null;
		try {
			cn = DBManager.getConnection();
			psSelectUser = cn.prepareStatement(Constants.SQL_SELECT_USER);
			psSelectUser.setString(INDEX_LOGIN, login);
			rs = psSelectUser.executeQuery();
			if (!rs.next()) {
				throw new DaoException(Constants.REPORT_NO_USER);
			} else {
				if(!rs.getString(INDEX_PASSWORD).equals(password)) {
					throw new DaoException(Constants.REPORT_WRONG_PASSWORD);
				}
				return new User(rs.getInt(INDEX_USER_ID), 
						UserRole.getUserRoleById(rs.getInt(INDEX_ROLE_ID)), login);
			}
		} catch (SQLException e) {
			throw new DaoException(e.getMessage());
		} finally {
			DBManager.closeResultSets(rs);
			DBManager.closeStatements(psSelectUser);
			DBManager.closeConnection(cn);
		}
	}
	@SuppressWarnings("resource")
	public User addAndGetUser(String login, String password) 
			throws DaoException {
		final int INDEX_LOGIN = 1, INDEX_PASSWORD = 2, INDEX_USER_ID = 1;
		Connection cn = null;
		PreparedStatement psSelectUser = null;
		PreparedStatement psInsertUser = null;
		ResultSet rs = null;
		try {
			cn = DBManager.getConnection();
			psSelectUser = cn.prepareStatement(Constants.SQL_SELECT_USER);
			psSelectUser.setString(INDEX_LOGIN, login);
			psInsertUser = cn.prepareStatement(Constants.SQL_INSERT_USER, 
					Statement.RETURN_GENERATED_KEYS);
			psInsertUser.setString(INDEX_LOGIN, login);
			psInsertUser.setString(INDEX_PASSWORD, password);
			synchronized (UserImplDB.class) {
				rs = psSelectUser.executeQuery();
				if (rs.next()) {
					throw new DaoException(Constants.REPORT_USER_EXIST);
				}
				psInsertUser.executeUpdate();
			}
			rs = psInsertUser.getGeneratedKeys();
			int userId = 0;
			if (rs.next()) {
				userId = rs.getInt(INDEX_USER_ID);
			}
			return new User(userId, UserRole.USER, login);
		} catch (SQLException e) {
			throw new DaoException(e.getMessage());
		} finally {
			DBManager.closeResultSets(rs);
			DBManager.closeStatements(psSelectUser, psInsertUser);
			DBManager.closeConnection(cn);
		}
	}
}
