//Hlazkova Alina 346316979

public final class GradeException extends Exception{
	
	public GradeException()
	{
		super("Error. Grade must be greater than 0 and less than 100.");
	}
	
	public GradeException(int grade)
	{	
		super("Error. This grade: " + grade + ". Grade must be greater than 0 and less than 100.");
	}

}
