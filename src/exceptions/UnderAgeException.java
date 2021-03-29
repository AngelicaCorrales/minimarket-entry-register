package exceptions;

public class UnderAgeException extends Exception{

	private static final long serialVersionUID = 1;
	
	public UnderAgeException() {
		super("No se permite el ingreso de menores de edad");
	}

}
