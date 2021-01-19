public class YearException extends Exception {

	public YearException(String s, int year)
	{
		super(s + " " + year);
	}
}
