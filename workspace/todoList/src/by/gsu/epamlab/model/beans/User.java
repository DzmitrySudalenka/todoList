package by.gsu.epamlab.model.beans;

public class User {
	private int id;
	private String name;
	private UserRole role;
	public User() {
		super();
	}
	public User(int id, UserRole role, String name) {
		super();
		this.id = id;
		this.role = role;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}