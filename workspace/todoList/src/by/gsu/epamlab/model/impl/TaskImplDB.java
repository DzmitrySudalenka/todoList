package by.gsu.epamlab.model.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.ifaces.ITaskDAO;
import by.gsu.epamlab.model.beans.File;
import by.gsu.epamlab.model.beans.Task;
import by.gsu.epamlab.model.beans.TaskSection;
import by.gsu.epamlab.model.beans.TaskStatus;
import by.gsu.epamlab.utils.DBManager;

public class TaskImplDB implements ITaskDAO {
	private Task getTask(ResultSet rs) throws SQLException {
		final int INDEX_TASK_ID = 1, INDEX_TASK_DESC = 3, 
				INDEX_TASK_DATE = 4, INDEX_FILE_ID = 6, INDEX_FILE_NAME = 8;
		int taskId = rs.getInt(INDEX_TASK_ID);
		String taskDesc = rs.getString(INDEX_TASK_DESC);
		Date taskDate = rs.getDate(INDEX_TASK_DATE);
		int fileId = rs.getInt(INDEX_FILE_ID);
		if (fileId == 0) {
			return new Task(taskId,taskDesc,taskDate);
		} else {
			String fileName = rs.getString(INDEX_FILE_NAME);
			File file = new File(fileId, fileName);
			return new Task(taskId,taskDesc,taskDate,file);
		}
	}
	public List<Task> getTasks(int userId, TaskSection taskSection) 
			throws DaoException {
		final int INDEX_USER_ID = 1;
		List<Task> tasks = new ArrayList<Task>();
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			cn = DBManager.getConnection();
			ps = cn.prepareStatement(taskSection.getQuery());
			ps.setInt(INDEX_USER_ID, userId);
			rs = ps.executeQuery();
			while (rs.next()) {
				Task task = getTask(rs);
				tasks.add(task);
			}
			return tasks;
		} catch (SQLException e) {
			throw new DaoException(e.getMessage());
		} finally {
			DBManager.closeResultSets(rs);
			DBManager.closeStatements(ps);
			DBManager.closeConnection(cn);
		}
	}
	public List<Task> getTasks(int userId, String[] taskIds) 
			throws DaoException {
		final int INDEX_TASK_ID = 1;
		List<Task> tasks = new ArrayList<Task>();
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			cn = DBManager.getConnection();
			ps = cn.prepareStatement(Constants.SQL_SELECT_TASK_BY_ID);
			for (String strTaskId : taskIds) {
				ps.setString(INDEX_TASK_ID, strTaskId);
				rs = ps.executeQuery();
				rs.next();
				Task task = getTask(rs);
				tasks.add(task);
			}
			return tasks;
		} catch (SQLException e) {
			throw new DaoException(e.getMessage());
		} finally {
			DBManager.closeResultSets(rs);
			DBManager.closeStatements(ps);
			DBManager.closeConnection(cn);
		}
	}
	public void addTask(int userId, String description, Date date) 
			throws DaoException {
		final int INDEX_USER_ID = 1, INDEX_TASK_DESC = 2, INDEX_TASK_DATE = 3;
		Connection cn = null;
		PreparedStatement ps = null;
		try {
			cn = DBManager.getConnection();
			ps = cn.prepareStatement(Constants.SQL_INSERT_TASK);
			ps.setInt(INDEX_USER_ID, userId);
			ps.setString(INDEX_TASK_DESC, description);
			ps.setDate(INDEX_TASK_DATE, date);
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e.getMessage());
		} finally {
			DBManager.closeStatements(ps);
			DBManager.closeConnection(cn);
		}
	}
	public void changeTaskStatuses(String[] taskIds, TaskStatus newTaskStatus) 
			throws DaoException {
		final int INDEX_TASK_ID = 1;
		Connection cn = null;
		PreparedStatement ps = null;
		try {
			cn = DBManager.getConnection();
			ps = cn.prepareStatement(newTaskStatus.getQuery());
			for(int i=0; i<taskIds.length; i++) {
				ps.setInt(INDEX_TASK_ID, Integer.parseInt(taskIds[i]));
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			throw new DaoException(e.getMessage());
		} finally {
			DBManager.closeStatements(ps);
			DBManager.closeConnection(cn);
		}
	}
	public void deleteTask(int taskId) throws DaoException {
		final int INDEX_TASK_ID = 1;
		Connection cn = null;
		PreparedStatement ps = null;
		try {
			cn = DBManager.getConnection();
			ps = cn.prepareStatement(Constants.SQL_DELETE_TASK_BY_ID);
			ps.setInt(INDEX_TASK_ID, taskId);
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e.getMessage());
		} finally {
			DBManager.closeStatements(ps);
			DBManager.closeConnection(cn);
		}
	}
	public void addTaskFile(int taskId, String fileName) throws DaoException {
		final int INDEX_TASK_ID = 1, INDEX_FILE_NAME = 2;
		Connection cn = null;
		PreparedStatement ps = null;
		try {
			cn = DBManager.getConnection();
			ps = cn.prepareStatement(Constants.SQL_INSERT_TASK_FILE);
			ps.setInt(INDEX_TASK_ID, taskId);
			ps.setString(INDEX_FILE_NAME, fileName);
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e.getMessage());
		} finally {
			DBManager.closeStatements(ps);
			DBManager.closeConnection(cn);
		}
	}
	public String getTaskFileName(int taskId) throws DaoException {
		final int INDEX_TASK_ID = 1, INDEX_FILE_NAME = 3;
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			cn = DBManager.getConnection();
			ps = cn.prepareStatement(Constants.SQL_SELECT_TASK_FILE);
			ps.setInt(INDEX_TASK_ID, taskId);
			rs = ps.executeQuery();
			rs.next();
			String fileName = rs.getString(INDEX_FILE_NAME);
			return fileName;
		} catch (SQLException e) {
			throw new DaoException(e.getMessage());
		} finally {
			DBManager.closeStatements(ps);
			DBManager.closeConnection(cn);
		}
	}
	public void deleteTaskFile(int taskId) throws DaoException {
		final int INDEX_TASK_ID = 1;
		Connection cn = null;
		PreparedStatement ps = null;
		try {
			cn = DBManager.getConnection();
			ps = cn.prepareStatement(Constants.SQL_DELETE_TASK_FILE);
			ps.setInt(INDEX_TASK_ID, taskId);
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e.getMessage());
		} finally {
			DBManager.closeStatements(ps);
			DBManager.closeConnection(cn);
		}		
	}
}
