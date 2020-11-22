import java.util.Scanner;

public class Passport {
	private String name;
	private MyDate birthDay;
	private String gender;
	private MyDate lastExit;
	private MyDate lastReturn;
	
	public Passport()
	{
		
	}
	public Passport(String name, MyDate birthDay, String gender)
	{
		this.name = name;
		this.birthDay = birthDay;
		setGender(gender);
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setBirthDay(MyDate bd)
	{
		birthDay = bd;
	}

	public void setGender(String g)
	{
		String gen = g.toUpperCase();
		if(gen.equals("M") || gen.equals("F"))
			this.gender = gen;
	}
	
	public void setLastExit(MyDate le)
	{
		lastExit = le;
	}
	
	public void setLastReturn(MyDate lr)
	{
		lastReturn = lr;
	}
	
	public String getName()
	{
		return name;
	}
	
	public MyDate getBirthDay()
	{
		return birthDay;
	}

	public String getGender()
	{
		return gender;
	}
	
	public MyDate getLastExit()
	{
		return lastExit;
	}
	
	public MyDate getLastReturn()
	{
		return lastReturn;
	}
	
	public void print()
	{
		if(lastExit!= null && lastReturn!=null)
			System.out.printf("Name: %s\nBirthDay: %sGender: %s\nLast exit: %sLast return: %s",name, birthDay.returnDate(), gender, lastExit.returnDate(), lastReturn.returnDate());
		else if(lastReturn==null && lastExit == null)
			System.out.printf("Name: %s\nBirthDay: %sGender: %s\n",name, birthDay.returnDate(), gender);
		else if(lastExit== null)
			System.out.printf("Name: %s\nBirthDay: %sGender: %s\nLast return: %s",name, birthDay.returnDate(), gender,  lastReturn.returnDate());
		else
			System.out.printf("Name: %s\nBirthDay: %sGender: %s\nLast exit: %s",name, birthDay.returnDate(), gender, lastExit.returnDate());
	}
	
	public boolean equals(Passport other)
	{
		if(getName().equals(other.getName()) && getBirthDay().equals(other.getBirthDay()) && getGender().equals(other.getGender()))
			return true;
		else return false;
	}
	
	public void fillPassport()
	{
		Passport pass = new Passport();
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter name: ");
		setName(input.next());
		System.out.print("Please enter date: \n");
		setBirthDay(new MyDate().enterDate());
		System.out.print("Please enter gender: ");
		setGender(input.next());
	}
	
	public static void main(String[] args) {
		Passport p1 = new Passport("Alina", new MyDate(9, 9, 1999), "f");
		p1.setLastExit(new MyDate());
		p1.print();
		Passport[] passports = new Passport[5];
		for(int i =0; i< 5; i++)
		{
			passports[i] = new Passport();
			passports[i].fillPassport();
		}
		for(Passport p: passports)
			p.print();
		Passport pass = new Passport();
		pass.fillPassport();
		boolean b = false;
		for(int i = 0; i < passports.length; i++)
		{
			if (passports[i].equals(pass))
			{
				b = true;
				System.out.println("This person in number " + (i+1));
			}
		}
		if(!b)
			System.out.println("This person is not in list");
		
		MyDate d = new MyDate().enterDate();
		for(int i = 0; i < passports.length; i++)
		{
			if (d.isOlder(passports[i].birthDay))
			{
				passports[i].print();
			}
		}
		
	}

}
