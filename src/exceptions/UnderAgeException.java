package exceptions;

public class UnderAgeException extends Exception{

	private static final long serialVersionUID = 1;
	
	public UnderAgeException() {
		super("ERROR: Minors are not allowed");
	}

}
