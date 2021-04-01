package exceptions;

public class NoDayException extends Exception{

	private static final long serialVersionUID = 1;
	private int secondLastNumber;
	private int actualDay;
	public NoDayException(int secondLastNumb, int day) {
		super("ERROR: You do not have the day according to the second last number of your document ("+secondLastNumb+") and the day of the month ("+day+")");
		secondLastNumber=secondLastNumb;
		actualDay=day;
	}
	
	public int getSecondLastNumber() {
		return secondLastNumber;
	}
	public int getActualDay() {
		return actualDay;
	}
	
	
	
}
