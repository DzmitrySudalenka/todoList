package by.gsu.epamlab.ifaces;

import java.sql.Date;
import java.util.List;

import by.gsu.epamlab.exceptions.DaoException;
import by.gsu.epamlab.model.beans.Task;
import by.gsu.epamlab.model.beans.TaskSection;
import by.gsu.epamlab.model.beans.TaskStatus;

public interface ITaskDAO {
	List<Task> getTasks(int userId, TaskSection taskSection) throws DaoException;
	List<Task> getTasks(int userId, String[] taskIds) throws DaoException;
	void addTask(int userId, String description, Date date) throws DaoException;
	void changeTaskStatuses(String[] taskIds, TaskStatus newTaskStatus) throws DaoException;
	void deleteTask(int taskId) throws DaoException;
	void addTaskFile(int taskId, String fileName) throws DaoException;
	String getTaskFileName(int taskId) throws DaoException;
	void deleteTaskFile(int fileId) throws DaoException;
}
