
public class Time {
	
	int hour;
	int minute;
	int second;
	
	public Time(int h, int m, int s) 
	{
		if(h >= 0 && h <=23)
			hour = h;
		else hour = 0;
		if(m >= 0 && m <= 59)
			minute = m;
		else
			minute = 0;
		if(s >= 0 && s <= 59)
			second = s;
		else
			second = 0;		
	}
	
	public Time(Time other)
	{
		hour = other.hour;
		minute = other.minute;
		second = other.second;
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}

	public int getSecond()
	{
		return second;
	}
	
	public void setHour(int num) 
	{
		if(num >= 0 && num <= 23)
			hour = num;
	}
	
	public void setMinute(int num) 
	{
		if(num >= 0 && num <= 59)
			minute = num;
	}
	
	public void setSecond(int num) 
	{
		if(num >= 0 && num <= 59)
			second = num;
	}
	
	public void printTime()
	{
		if(second != 0)
			System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
		else
			System.out.printf("%02d:%02d%n", hour, minute);
	}
	
	public boolean equals(Time other)
	{
		if(other.hour == hour && other.minute == minute && other.second == second)
			return true;
		else return false;
	}
	
	public int difference(Time other)
	{
		return Math.abs(hour - other.hour)*3600 + Math.abs(minute - other.minute)*60 + Math.abs(second - other.second);
	}
	
	public Time winter()
	{
		return changeTimeZone(-1);
	}
	
	public Time summer()
	{
		return changeTimeZone(1);
	}
	
	public Time changeTimeZone(int zone)
	{
		int newHour = (hour + zone) - (hour + zone)/24*24;
		return new Time(newHour, this.minute, this.second);
	}
	
	public static void main(String[] args) {
		
		Time t1 = new Time(5, 30, 45);
		Time t2 = new Time(1, 36, 57);
		Time t3 = new Time(5, 78, 98);
		Time t4 = new Time(t1);
		t3.printTime();
		
		System.out.println(t1.equals(t4));
		System.out.println(t2.equals(t4));
		
		System.out.println(t1.getHour());
		System.out.println(t1.getMinute());
		System.out.println(t1.getSecond());
		
		t4.printTime();
		
		t4.setHour(14);
		t4.setMinute(14);
		t4.setSecond(14);
		
		t4.printTime();
		
		System.out.println(t4.difference(new Time(15, 15, 15)));
		
		t4.winter().printTime();
		t2.printTime();
		t2.summer().printTime();
		
		Time t5 = new Time(23, 59, 59);
		t5.printTime();
		t5.changeTimeZone(49).printTime();
	
	}

}
