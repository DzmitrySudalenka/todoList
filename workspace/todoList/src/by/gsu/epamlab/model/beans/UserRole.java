package by.gsu.epamlab.model.beans;

import java.util.HashMap;
import java.util.Map;

public enum UserRole {
	ADMIN(1), USER(2);
	private final int id;
	private static final Map<Integer, UserRole> userRoles = 
			new HashMap<Integer, UserRole>();
    static {
        for (UserRole userRole : UserRole.values()) {
        	userRoles.put(userRole.getId(), userRole);
        }
    }
	private UserRole(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public static UserRole getUserRoleById(int id) {
        return userRoles.get(id);
    }
}
