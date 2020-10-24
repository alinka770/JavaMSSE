import java.util.Scanner;

public class Program2_2 {
	
	public static int countDigits(int num)
	{
		return (int)(Math.log10(num) + 1);
	}

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
	
	public static int maxDigit(int e, int d, int s, int t, int dt)
	{
		int maxDigit = e;
		if(e >= d && e >= s && e >= t && e>= dt)
		{
			maxDigit = e;
		}
		else if (d >= e && d >= s && d >= t && d>= dt)
		{
			maxDigit = d;
		}
		else if (s >= d && s >= e && s >= t && s>= dt)
		{
			maxDigit = s;
		}
		else if (t >= d && t >= e && t >= s && t>= dt)
		{
			maxDigit = t;
		}
		else if (dt >= d && dt >= e && dt >= t && dt>= s)
		{
			maxDigit = dt;
		}
		return maxDigit;
	}
	
	public static int minDigit(int e, int d, int s)
	{
		int minDigit = e;
		if (e <= d && e >= s)
		{
			minDigit = e;
		}
		else if (d <= e && d >= s)
		{
			minDigit = d;
		}
		else if (s <= d && s >= e)
		{
			minDigit = s;
		}
		return minDigit;
	}
	
	public static int minDigit(int e, int d, int s, int t, int dt)
	{
		int minDigit = e;
		if(e <= d && e <= s && e <= t && e <= dt)
		{
			minDigit = e;
		}
		else if (d <= e && d <= s && d <= t && d <= dt)
		{
			minDigit = d;
		}
		else if (s <= d && s <= e && s <= t && s <= dt)
		{
			minDigit = s;
		}
		else if (t <= d && t <= e && t <= s && t <= dt)
		{
			minDigit = t;
		}
		else if (dt <= d && dt <= e && dt <= t && dt <= s)
		{
			minDigit = dt;
		}
		return minDigit;
	}
	
	public static void main(String[] args) {
		
		int number, e, d, s, t, dt,maxDigit, minDigit, result = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите целое число: ");
		number = input.nextInt();
		
		int length = countDigits(number);

		switch (length)
		{
			case 2: 
				e = number%10;
				d = (number/10)%10;
				maxDigit = Math.max(e,  d);
				minDigit = Math.min(e, d);
				result = maxDigit- minDigit;
				break;
				
			case 3:
				e = number%10;
				d = (number/10)%10;
				s = (number/100)%10;
				result = maxDigit(e, d, s);
				break;
				
			case 4:
				e = number%10;
				d = (number/10)%10;
				s = (number/100)%10;
				t = (number/1000)%10;
				String first = t+ "" +s;
				String second = e+ "" +d;				
				if(Integer. parseInt(first) == Integer. parseInt(second))
				{
					System.out.println("Число симметричное");
				}
				else
				{
					System.out.println("Число не симметричное");
				}
				break;
				
			case 5:
				e = number%10;
				d = (number/10)%10;
				s = (number/100)%10;
				t = (number/1000)%10;
				dt = (number/10000)%10;
				maxDigit = maxDigit(e,  d, s, t, dt);
				minDigit = minDigit(e, d, s, t, dt);
				result = maxDigit + minDigit;
				break;
		}
		
		if (result != 0)
			System.out.println(result);

	}

}
