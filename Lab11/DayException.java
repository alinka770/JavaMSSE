public class DayException extends Exception{
	
	public DayException(String s, int day)
	{
		super(s + " " + day);
	}

}
