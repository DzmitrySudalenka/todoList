package by.gsu.epamlab.model.factories;

import by.gsu.epamlab.ifaces.IUserDAO;
import by.gsu.epamlab.model.impl.UserImplDB;
import by.gsu.epamlab.model.impl.UserImplMemory;

@SuppressWarnings("unused")
public class UserFactory {
	public static IUserDAO getClassFromFactory() {
		// return new UserImplMemory();
		return new UserImplDB();
	}
}
