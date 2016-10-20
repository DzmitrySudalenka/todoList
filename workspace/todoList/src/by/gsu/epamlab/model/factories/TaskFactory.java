package by.gsu.epamlab.model.factories;

import by.gsu.epamlab.ifaces.ITaskDAO;
import by.gsu.epamlab.model.impl.TaskImplDB;

public class TaskFactory {
	public static ITaskDAO getClassFromFactory() {
		return new TaskImplDB();
	}
}
