//Hlazkova Alina 346316979
public class Location {
	private int id;
	private  static int idH = 0;
	private String name;
	private Temperature temp[];
	
	public Location(String name)
	{
		setName(name);
		id = ++idH;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public static int getCount()
	{
		return idH;
	}
	
	/*printLocation – печатает номер и название географического места. А также
печатает замеры температур или сообщение об отсутсвие замеров.
public void printLocation( )
*/
	public void printLocation()
	{  
		System.out.println(id + ". " + name + "  temperature measurements ");
		if(temp!=null)
		{
			for(Temperature t: temp)
			{
				t.printTempFull();
				System.out.print(" ");
			}
		}
		else
			System.out.println("No temperature measurements");
		System.out.println();
	}
	/*Если функция получает в виде параметра вещественное число следует
распечатать только замеры температур отдаленные не больше этого числа к
средней температуре.
void printLocation(double)
*/
	public void printLocation(double measure)
	{  
		System.out.println(id + ". " + name + "  temperature measurements ");
		if(temp!=null)
		{
			for(Temperature t: temp)
			{
				if(Math.abs(t.getScale()-average())<= measure)
					{
						t.printTempFull();
						System.out.print(" ");
					}
					
			}
		}
		else
			System.out.println("No temperature measurements");
	}
	
	/*double average() - return average scale of array temp*/
	public double average()
	{
		double sum = 0;
		if(temp!=null)
		{
			for(Temperature t: temp)
			{
				sum += t.getScale();
			}
		}
		else return 0;
		return sum/temp.length;
	}
	
	/*addTemp - который получает в виде параметров температуру и календарное
число замера и добавляет в список замеров температур.
void addTemp(double, int, int, int)
*/

	public void addTemp(double temper, int date, int month, int year)
	{
		if(temp == null)
		{
			temp = new Temperature[1];
		}
		else
		{
			Temperature[] tmp = new Temperature[temp.length + 1];
			for(int i = 0; i < temp.length; i++)
				tmp[i] = temp[i];
			temp = tmp;
		}
		temp[temp.length - 1] = new Temperature(temper, date, month, year);
	}
	
	/*Если получает только температуру следует добавить текущее календарное
число.
void addTemp(double)*/
	public void addTemp(double temper)
	{
		if(temp == null)
		{
			temp = new Temperature[1];
		}
		else
		{
			Temperature[] tmp = new Temperature[temp.length + 1];
			for(int i = 0; i < temp.length; i++)
				tmp[i] = temp[i];
			temp = tmp;
		}
		temp[temp.length - 1] = new Temperature(temper);
	}
	/*Temperature max - возвращает максимальный замер температуры из списка замеров или
null, если список замеров пустой.
Temperature max( )*/
	public Temperature max()
	{
		Temperature maxT = temp[0];
		if(temp == null)
			return null;
		else
		{
			for(Temperature t: temp)
			{
				if(maxT.getScale() < t.getScale())
					maxT = t;
			}
		}
		return maxT;
	}
}
