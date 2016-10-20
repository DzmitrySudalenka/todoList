package by.gsu.epamlab.model.beans;

public class File {
	private int id;
	private String name;
	public File() {
		super();
	}
	public File(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
