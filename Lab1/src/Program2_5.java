import java.util.Scanner;

public class Program2_5 {

	public static int maxDigit(int e, int d, int s)
	{
		int maxDigit = e;
		if(e >= d && e >= s)
		{
			maxDigit = e;
		}
		else if (d >= e && d >= s)
		{
			maxDigit = d;
		}
		else if (s >= e && s >= d)
		{
			maxDigit = s;
		}
		return maxDigit;
	}
	
	public static int maxDigit(int e, int d, int s, int t)
	{
		int maxDigit = e;
		if(e >= d && e >= s && e >= t)
		{
			maxDigit = e;
		}
		else if (d >= e && d >= s && d >= t)
		{
			maxDigit = d;
		}
		else if (s >= d && s >= e && s >= t)
		{
			maxDigit = s;
		}
		else if (t >= d && t >= e && t >= s)
		{
			maxDigit = t;
		}
		return maxDigit;
	}
	
	public static void main(String[] args) {
		
		int number, e, d, s, t, maxDigit;
		String str = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите целое четырёхзначное число: ");
		number = input.nextInt();
		
		e = number%10;
		d = (number/10)%10;
		s = (number/100)%10;
		t = (number/1000)%10;
		
		maxDigit = maxDigit(e, d, s, t);
		
		if (maxDigit == e)
			{
			str += e;
			maxDigit = maxDigit(d, s, t);
			if (maxDigit == d)
			{
				str += d;
				maxDigit = Math.max(s, t);
				if (maxDigit == s)
					{
					str += s;
					str += t;
					}
				else 
					{
					str += t;
					str += s;
					}
			}
			else if (maxDigit == s)
			{
				str += s;
				maxDigit = Math.max(d, t);
				if (maxDigit == d)
					{
					str += d;
					str += t;
					}
				else 
					{
					str += t;
					str += d;
					}
			}
			else if	(maxDigit == t)
			{
				str += t;
				maxDigit = Math.max(d, s);
				if (maxDigit == s)
					{
					str += s;
					str += d;
					}
				else 
					{
					str += d;
					str += s;
					}
			}
			}
		else if (maxDigit == d)
			{
			str += d;
			maxDigit = maxDigit(e, s, t);
			if (maxDigit == e)
			{
				str += e;
				maxDigit = Math.max(s, t);
				if (maxDigit == s)
					{
					str += s;
					str += t;
					}
				else 
					{
					str += t;
					str += s;
					}
			}
			else if (maxDigit == s)
			{
				str += s;
				maxDigit = Math.max(e, t);
				if (maxDigit == e)
					{
					str += e;
					str += t;
					}
				else 
					{
					str += t;
					str += e;
					}
			}
			else if	(maxDigit == t)
			{
				str += t;
				maxDigit = Math.max(e, s);
				if (maxDigit == s)
					{
					str += s;
					str += e;
					}
				else 
					{
					str += e;
					str += s;
					}
			}
			}
		else if (maxDigit == s)
			{
			str += s;
			maxDigit = maxDigit(d, e, t);
			if (maxDigit == d)
			{
				str += d;
				maxDigit = Math.max(e, t);
				if (maxDigit == e)
					{
					str += e;
					str += t;
					}
				else 
					{
					str += t;
					str += e;
					}
			}
			else if (maxDigit == e)
			{
				str += e;
				maxDigit = Math.max(d, t);
				if (maxDigit == d)
					{
					str += d;
					str += t;
					}
				else 
					{
					str += t;
					str += d;
					}
			}
			else if	(maxDigit == t)
			{
				str += t;
				maxDigit = Math.max(d, e);
				if (maxDigit == e)
					{
					str += e;
					str += d;
					}
				else 
					{
					str += d;
					str += e;
					}
			}
			}
		else if (maxDigit == t)
			{
			str +=t;
			maxDigit = maxDigit(d, s, e);
			if (maxDigit == d)
			{
				str += d;
				maxDigit = Math.max(s, e);
				if (maxDigit == s)
					{
					str += s;
					str += e;
					}
				else 
					{
					str += e;
					str += s;
					}
			}
			else if (maxDigit == s)
			{
				str += s;
				maxDigit = Math.max(d, e);
				if (maxDigit == d)
					{
					str += d;
					str += e;
					}
				else 
					{
					str += e;
					str += d;
					}
			}
			else if	(maxDigit == e)
			{
				str += e;
				maxDigit = Math.max(d, s);
				if (maxDigit == s)
					{
					str += s;
					str += d;
					}
				else 
				{
					str += d;
					str += s;
				}
			}
			}
		System.out.println("Новое число " + str);

	}

}
