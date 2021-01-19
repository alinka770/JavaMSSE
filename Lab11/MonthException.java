public class MonthException extends Exception{

	public MonthException(String s, int month)
	{
		super(s + " " + month);
	}
}
