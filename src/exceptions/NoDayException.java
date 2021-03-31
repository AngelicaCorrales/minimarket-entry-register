package exceptions;

public class NoDayException extends Exception{

	private static final long serialVersionUID = 1;
	
	public NoDayException(int secondLastNumb, int day) {
		super("ERROR: No le corresponde el d�a de acuerdo con el pen�ltimo n�mero de su c�dula "+"("+secondLastNumb+")"+" y el d�a del mes"+"("+day+")");
	}

}
