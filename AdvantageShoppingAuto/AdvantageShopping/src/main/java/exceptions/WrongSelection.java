package exceptions;

public class WrongSelection extends AssertionError {

	public static final String WRONG_SELECTION = "El valor es incorrecto";

	public WrongSelection(String message, Throwable cause) {
		super(message, cause);

	}
}
