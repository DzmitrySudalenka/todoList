package by.gsu.epamlab.exceptions;

public class DaoException extends Exception {
	private static final long serialVersionUID = 1L;
	public DaoException() {
		super();
	}
	public DaoException(String cause) {
		super(cause);
	}
	public String toString() {
		return getMessage();
	}
}
