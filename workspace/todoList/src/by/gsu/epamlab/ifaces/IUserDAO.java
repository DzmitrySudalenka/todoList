package by.gsu.epamlab.ifaces;

import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.model.beans.User;

public interface IUserDAO {
	public User getUser(String login, String password) throws DaoException;
	public User addAndGetUser(String login, String password) throws DaoException;
}
