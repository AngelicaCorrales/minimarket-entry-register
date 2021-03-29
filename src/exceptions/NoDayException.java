package exceptions;

public class NoDayException extends Exception{

	private static final long serialVersionUID = 1;
	
	public NoDayException() {
		super("No le corresponde el día de acuerdo con el número de su cédula y el día del mes");
	}

}
