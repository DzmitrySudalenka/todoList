package by.gsu.epamlab.model.beans;

import java.util.Date;

public class Task {
	private int id;
	private String description;
	private Date date;
	private File file;
	public Task() {
		super();
	}
	public Task(int id, String description, Date date) {
		this.id = id;
		this.description = description;
		this.date = date;
		this.file = null;
	}
	public Task(int id, String description, Date date, File file) {
		this.id = id;
		this.description = description;
		this.date = date;
		this.file = file;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public boolean isHaveFile() {
		if (file == null) {
			return false;
		}
		return true;
	}
}
