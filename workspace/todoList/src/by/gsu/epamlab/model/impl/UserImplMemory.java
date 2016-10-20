package by.gsu.epamlab.model.impl;

import by.gsu.epamlab.model.beans.UserRole;
import by.gsu.epamlab.model.beans.User;

import java.util.HashMap;
import java.util.Map;

import by.gsu.epamlab.Constants;
import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.ifaces.IUserDAO;

public class UserImplMemory implements IUserDAO {
	static class UserData {
		private int id;
		private UserRole role;
		private String password;
		public UserData(int id, UserRole role, String password) {
			this.id = id;
			this.role = role;
			this.password = password;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public UserRole getRole() {
			return role;
		}
		public void setRole(UserRole role) {
			this.role = role;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
	private static Map<String, UserImplMemory.UserData> users = 
			new HashMap<String, UserImplMemory.UserData>();
	static {
		users.put("sys", new UserData(1, UserRole.ADMIN, "111"));
		users.put("boss", new UserData(2, UserRole.USER, "000"));
	}
	public User getUser(String login, String password) throws DaoException {
		UserData userData = users.get(login);
		if (userData == null) {
			throw new DaoException(Constants.REPORT_NO_USER);
		} else {
			if(!password.equals(userData.getPassword())) {
				throw new DaoException(Constants.REPORT_WRONG_PASSWORD);
			}
		}
		return new User(userData.getId(), userData.getRole(), login);
	}
	public User addAndGetUser(String login, String password) throws DaoException {
		int userId = users.size() + 1;
		UserData userData = new UserData(userId, UserRole.USER, password);
		synchronized(UserImplMemory.class) {
			if (users.containsKey(login)) {
				throw new DaoException(Constants.REPORT_USER_EXIST);
			} else {
				users.put(login, userData);
			}
        }
		return new User(userId, UserRole.USER, login);
	}
}
