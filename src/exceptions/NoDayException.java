package exceptions;

public class NoDayException extends Exception{

	private static final long serialVersionUID = 1;
	
	public NoDayException() {
		super("No le corresponde el d�a de acuerdo con el n�mero de su c�dula y el d�a del mes");
	}

}
