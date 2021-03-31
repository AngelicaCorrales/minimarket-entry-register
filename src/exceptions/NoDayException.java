package exceptions;

public class NoDayException extends Exception{

	private static final long serialVersionUID = 1;
	
	public NoDayException(int secondLastNumb, int day) {
		super("ERROR: No le corresponde el día de acuerdo con el penúltimo número de su cédula "+"("+secondLastNumb+")"+" y el día del mes"+"("+day+")");
	}

}
