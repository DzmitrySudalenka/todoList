package by.gsu.epamlab.exceptions;

public class ValidationException extends Exception {
	private static final long serialVersionUID = 1L;
	public ValidationException() {
		super();
	}
	public ValidationException(String cause) {
		super(cause);
	}
	public String toString() {
		return getMessage();
	}
}
