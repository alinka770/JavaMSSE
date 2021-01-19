//Hlazkova Alina 346316979
public class Temperature {
	
	private double scale;
	private MyDate scale_date;
	
	public Temperature(double scale, int day, int month, int year)
	{
		this.scale = scale;
		scale_date = new MyDate(day, month, year);
	}
	
	public Temperature(double scale)
	{
		this.scale = scale;
		scale_date = new MyDate();
	}

	public Temperature(Temperature temp)
	{
		this.scale = temp.scale;
		this.scale_date = temp.scale_date;
	}
	
	public double getScale()
	{
		return this.scale;
	}
	
	/*void printTemp() - print temperature*/
	
	public void printTemp()
	{
		if(scale > 0)
			System.out.print("\n+" + scale+"°C ");
		else
			System.out.print("\n" + scale+"°C ");
	}
	/*void printtempFull() - print temperature and date*/
	public void printTempFull()
	{
		printTemp();
		scale_date.printDate();
	}
	/*Temparature compate(Temperature) - compare two scale of temperature and return Temperature with a maximum scale*/
	public Temperature compare(Temperature temp)
	{
		if(this.scale > temp.scale)
			return this;
		else
			return temp;
	}
}
