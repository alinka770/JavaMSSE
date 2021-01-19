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
	
	/*printLocation � �������� ����� � �������� ��������������� �����. � �����
�������� ������ ���������� ��� ��������� �� ��������� �������.
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
	/*���� ������� �������� � ���� ��������� ������������ ����� �������
����������� ������ ������ ���������� ���������� �� ������ ����� ����� �
������� �����������.
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
	
	/*addTemp - ������� �������� � ���� ���������� ����������� � �����������
����� ������ � ��������� � ������ ������� ����������.
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
	
	/*���� �������� ������ ����������� ������� �������� ������� �����������
�����.
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
	/*Temperature max - ���������� ������������ ����� ����������� �� ������ ������� ���
null, ���� ������ ������� ������.
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
