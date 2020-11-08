import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	public MyDate()
	{
		LocalDateTime date = LocalDateTime.now();
		day = date.getDayOfMonth();
		month = date.getMonthValue();
		year = date.getYear();	
	}
	
	public MyDate (int d, int m, int y) 
	{
		setDay(d);
		setMonth(m);
		setYear(y);
	}

	public MyDate (MyDate other)
	{
		day = other.day;
		month = other.month;
		year = other.year;
	}
	
	public void printDate()
	{
		System.out.printf("%02d/%02d/%d%n", day, month, year);
	}
	
	public String nameOfMon()
	{
		String mon = "";
		switch(month)
		{
		 	case 1: 
		 		mon = "Jan";
		 		break;
		 	case 2:
		 		mon = "Feb";
		 		break;
		 	case 3:
		 		mon = "March";
		 		break;
		 	case 4:
		 		mon = "April";
		 		break;
		 	case 5:
		 		mon = "May";
		 		break;
		 	case 6:
		 		mon = "June";
		 		break;
		 	case 7:
		 		mon = "July";
		 		break;
		 	case 8:
		 		mon = "August";
		 		break;
		 	case 9:
		 		mon = "Sep";
		 		break;
		 	case 10:
		 		mon = "Oct";
		 		break;
		 	case 11:
		 		mon = "Nov";
		 		break;
		 	case 12:
		 		mon = "Dec";
		 		break;
		}
		return mon;
	}
	public void printMonthName()
	{
		System.out.printf("%02d %s %d%n", day, nameOfMon(), year);
	}
	
	public int getMonthDay()
	{
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		else if(month == 2 && isLeapYear())
			return 29;
		else if(month == 2 && !isLeapYear())
			return 28;
		else
			return 30;
	}
	
	public boolean isLeapYear()
	{
		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
			return true;
		else return false;
	}
	
	public void nextDate()
	{
		if(getMonthDay() == 30 && day == 30)
		{
			setDay(1);
			setMonth(month + 1);
		}
		else if(getMonthDay() == 31 && day == 31)
		{
			setDay(1);
			if(month == 12)
				{
					setMonth(1);
					setYear(year + 1);
				}
			else
				setMonth(month + 1);
		}
		else if(month == 2)
		{
			if(day == 29 && isLeapYear())
			{
				setDay(1);
				setMonth(3);
			}
			else if(day == 28 && !isLeapYear())
			{
				setDay(1);
				setMonth(3);
			}
			else
				setDay(day + 1);
		}
		else
			setDay(day + 1);
	}
	
	public void printFormatDate(String str)
	{
		if(str == "ddmmyy")
			System.out.printf("%02d/%02d/%s%n", day, month, String.valueOf(year).substring(2));
		else if(str == "ddmmyyyy")
			printDate();
		else if(str == "mmddyyyy")
			System.out.printf("%02d/%02d/%d%n", month, day, year);
		else if(str == "yyyymmdd")
			System.out.printf("%d/%02d/%02d%n", year, month, day);
		else if(str == "ddMMyyyy")
			System.out.printf("%02d %s %s%n", day, nameOfMon(), String.valueOf(year).substring(2));
			
	}
	
	public int difference(MyDate other)
	{
		int numYear = 365;
		int monNum = 30;
		return Math.abs(year - other.year)*numYear + Math.abs(month - other.month)*monNum + Math.abs(day - other.day);
	}
	
	public void setDay(int d)
	{
		if(d >= 1 && d <=31)
			day = d;
		else {
			day = LocalDateTime.now().getDayOfMonth();
		}
	}
	
	public void setMonth(int m)
	{
		if(m >= 1 && m <=12)
			month = m;
		else {
			month = LocalDateTime.now().getMonthValue();
		}
	}
	
	public void setYear(int y)
	{
		if(y >= 1900 && y <= 2100)
			year = y;
		else {
			year = LocalDateTime.now().getYear();
		}
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public static void main(String[] args) {
		
		MyDate m = new MyDate();
		MyDate m1 = new MyDate(31, 12, 2012);
		m.printDate();
		m.printMonthName();
		System.out.println(m1.getMonthDay() + " days");
		System.out.println(m1.isLeapYear());
		m1.printDate();
		m1.nextDate();
		m1.printDate();
		m1.printFormatDate("ddmmyy");
		m.printFormatDate("mmddyyyy");
		m1.printFormatDate("ddmmyyyy");
		m1.printFormatDate("yyyymmdd");
		m1.printFormatDate("ddMMyyyy");
		System.out.println(m1.difference(m));

	}

}
