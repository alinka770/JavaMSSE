import java.util.ArrayList;
import java.util.Scanner;

public class HW {
	
	public static void printLandingTime(int h, int m, int s, int timeF)
	{
		int days = 0;
		if(h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59 || timeF == 0)
		{	
			System.out.println("It is not real time");
			return;
		}
		int time = h * 3600 + m * 60 + s;
		int newTime = time + timeF;
		int newH = newTime/3600;
		int newM = (newTime - newH * 3600)/60;
		int newS = (newTime - newH * 3600 - newM * 60);
		
		if(newH >= 24)
		{
			days = newH / 24;
			newH = newH - 24*days;
		}
		
		if(newH > 1)
		if (days == 0)
		{
		if(newH > 1)
		{
			if(newM > 1)
			{
				if(newS > 1)
					System.out.printf("%d hours, %d minutes, %d seconds%n", newH, newM, newS);
				else if(newS == 1)
					System.out.printf("%d hours, %d minutes, %d second%n", newH, newM, newS);
				else
					System.out.printf("%d hours, %d minutes%n", newH, newM);
			}
			else if (newM == 1)
			{
				if(newS > 1)
					System.out.printf("%d hours, %d minute, %d seconds%n", newH, newM, newS);
				else if(newS == 1)
					System.out.printf("%d hours, %d minute, %d second%n", newH, newM, newS);
				else
					System.out.printf("%d hours, %d minute%n", newH, newM);
			}
			else
			{
				if(newS > 1)
					System.out.printf("%d hours, %d seconds%n", newH, newS);
				else if(newS == 1)
					System.out.printf("%d hours, %d second%n", newH, newS);
				else
					System.out.printf("%d hours exactly%n", newH);
			}
		}
		else if(newH == 1)
		{
			if(newM > 1)
			{
				if(newS > 1)
					System.out.printf("%d hour, %d minutes, %d seconds%n", newH, newM, newS);
				else if(newS == 1)
					System.out.printf("%d hour, %d minutes, %d second%n", newH, newM, newS);
				else
					System.out.printf("%d hour, %d minutes%n", newH, newM);
			}
			else if (newM == 1)
			{
				if(newS > 1)
					System.out.printf("%d hour, %d minute, %d seconds%n", newH, newM, newS);
				else if(newS == 1)
					System.out.printf("%d hour, %d minute, %d second%n", newH, newM, newS);
				else
					System.out.printf("%d hour, %d minute%n", newH, newM);
			}
			else
			{
				if(newS > 1)
					System.out.printf("%d hour, %d seconds%n", newH, newS);
				else if(newS == 1)
					System.out.printf("%d hour, %d second%n", newH, newS);
				else
					System.out.printf("%d hour exactly%n", newH);
			}
		}
		else
		{
			if(newM > 1)
			{
				if(newS > 1)
					System.out.printf("%d minutes, %d seconds%n", newM, newS);
				else if(newS == 1)
					System.out.printf("%d minutes, %d second%n", newM, newS);
				else
					System.out.printf("%d minutes%n", newM);
			}
			else if (newM == 1)
			{
				if(newS > 1)
					System.out.printf("%d minute, %d seconds%n", newM, newS);
				else if(newS == 1)
					System.out.printf("%d minute, %d second%n", newM, newS);
				else
					System.out.printf("%d minute%n", newM);
			}
			else
			{
				if(newS > 1)
					System.out.printf(" %d seconds%n",  newS);
				else if(newS == 1)
					System.out.printf("%d second%n", newS);
				else
					System.out.printf("Racket can not fly 0 seconds%n", newH);
			}
		}
		}
		else if (days == 1)
		{
			if(newH > 1)
			{
				if(newM > 1)
				{
					if(newS > 1)
						System.out.printf("%d hours, %d minutes, %d seconds (+%d day) %n", newH, newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d hours, %d minutes, %d second  (+%d day) %n", newH, newM, newS, days);
					else
						System.out.printf("%d hours, %d minutes  (+%d day) %n", newH, newM, days);
				}
				else if (newM == 1)
				{
					if(newS > 1)
						System.out.printf("%d hours, %d minute, %d seconds  (+%d day) %n", newH, newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d hours, %d minute, %d second (+%d day) %n", newH, newM, newS, days);
					else
						System.out.printf("%d hours, %d minute (+%d day) %n", newH, newM, days);
				}
				else
				{
					if(newS > 1)
						System.out.printf("%d hours, %d seconds (+%d day) %n", newH, newS, days);
					else if(newS == 1)
						System.out.printf("%d hours, %d second (+%d day) %n", newH, newS, days);
					else
						System.out.printf("%d hours exactly (+%d day) %n", newH, days);
				}
			}
			else if(newH == 1)
			{
				if(newM > 1)
				{
					if(newS > 1)
						System.out.printf("%d hour, %d minutes, %d seconds  (+%d day) %n", newH, newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d hour, %d minutes, %d second (+%d day) %n", newH, newM, newS, days);
					else
						System.out.printf("%d hour, %d minutes (+%d day) %n", newH, newM, days);
				}
				else if (newM == 1)
				{
					if(newS > 1)
						System.out.printf("%d hour, %d minute, %d seconds  (+%d day) %n", newH, newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d hour, %d minute, %d second (+%d day) %n", newH, newM, newS, days);
					else
						System.out.printf("%d hour, %d minute (+%d day) %n", newH, newM, days);
				}
				else
				{
					if(newS > 1)
						System.out.printf("%d hour, %d seconds (+%d day) %n", newH, newS, days);
					else if(newS == 1)
						System.out.printf("%d hour, %d second (+%d day) %n", newH, newS, days);
					else
						System.out.printf("%d hour exactly  (+%d day) %n", newH, days);
				}
			}
			else
			{
				if(newM > 1)
				{
					if(newS > 1)
						System.out.printf("%d minutes, %d seconds  (+%d day) %n", newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d minutes, %d second (+%d day) %n", newM, newS, days);
					else
						System.out.printf("%d minutes (+%d day) %n", newM, days);
				}
				else if (newM == 1)
				{
					if(newS > 1)
						System.out.printf("%d minute, %d seconds (+%d day) %n", newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d minute, %d second (+%d day) %n", newM, newS, days);
					else
						System.out.printf("%d minute (+%d day) %n", newM, days);
				}
				else
				{
					if(newS > 1)
						System.out.printf(" %d seconds  (+%d day) %n",  newS, days);
					else if(newS == 1)
						System.out.printf("%d second  (+%d day) %n", newS, days);
					else
						System.out.printf("Racket can not fly 0 seconds%n", newH);
				}
			}
		}
		else
			if(newH > 1)
			{
				if(newM > 1)
				{
					if(newS > 1)
						System.out.printf("%d hours, %d minutes, %d seconds (+%d days) %n", newH, newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d hours, %d minutes, %d second  (+%d days) %n", newH, newM, newS, days);
					else
						System.out.printf("%d hours, %d minutes  (+%d days) %n", newH, newM, days);
				}
				else if (newM == 1)
				{
					if(newS > 1)
						System.out.printf("%d hours, %d minute, %d seconds  (+%d days) %n", newH, newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d hours, %d minute, %d second (+%d days) %n", newH, newM, newS, days);
					else
						System.out.printf("%d hours, %d minute (+%d days) %n", newH, newM, days);
				}
				else
				{
					if(newS > 1)
						System.out.printf("%d hours, %d seconds (+%d days) %n", newH, newS, days);
					else if(newS == 1)
						System.out.printf("%d hours, %d second (+%d days) %n", newH, newS, days);
					else
						System.out.printf("%d hours exactly (+%d days) %n", newH, days);
				}
			}
			else if(newH == 1)
			{
				if(newM > 1)
				{
					if(newS > 1)
						System.out.printf("%d hour, %d minutes, %d seconds  (+%d days) %n", newH, newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d hour, %d minutes, %d second (+%d days) %n", newH, newM, newS, days);
					else
						System.out.printf("%d hour, %d minutes (+%d days) %n", newH, newM, days);
				}
				else if (newM == 1)
				{
					if(newS > 1)
						System.out.printf("%d hour, %d minute, %d seconds  (+%d days) %n", newH, newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d hour, %d minute, %d second (+%d days) %n", newH, newM, newS, days);
					else
						System.out.printf("%d hour, %d minute (+%d days) %n", newH, newM, days);
				}
				else
				{
					if(newS > 1)
						System.out.printf("%d hour, %d seconds (+%d days) %n", newH, newS, days);
					else if(newS == 1)
						System.out.printf("%d hour, %d second (+%d days) %n", newH, newS, days);
					else
						System.out.printf("%d hour exactly  (+%d days) %n", newH, days);
				}
			}
			else
			{
				if(newM > 1)
				{
					if(newS > 1)
						System.out.printf("%d minutes, %d seconds  (+%d days) %n", newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d minutes, %d second (+%d days) %n", newM, newS, days);
					else
						System.out.printf("%d minutes (+%d days) %n", newM, days);
				}
				else if (newM == 1)
				{
					if(newS > 1)
						System.out.printf("%d minute, %d seconds (+%d days) %n", newM, newS, days);
					else if(newS == 1)
						System.out.printf("%d minute, %d second (+%d days) %n", newM, newS, days);
					else
						System.out.printf("%d minute (+%d days) %n", newM, days);
				}
				else
				{
					if(newS > 1)
						System.out.printf(" %d seconds  (+%d days) %n",  newS, days);
					else if(newS == 1)
						System.out.printf("%d second  (+%d days) %n", newS, days);
					else
						System.out.printf("Racket can not fly 0 seconds%n", newH);
				}
			}
	}
	
	public static boolean isEven(int number)
	{
		while (number > 0)
		{
			if((number%10)%2 == 0)
			{
				number = number/10;
				isEven(number);
			}
			else 
				return false;
		}
		return true;
	}
	
	public static boolean isOdd(int number)
	{
		while (number > 0)
		{
			if((number%10)%2 == 1)
			{
				number = number/10;
				isEven(number);
			}
			else 
				return false;
		}
		return true;
	}

	public static int getMax()
	{
		Scanner input = new Scanner(System.in);
		int max = 0;
		System.out.print("Please enter 10 plus int numbers: ");
		int[] numbers = new int[10];
		for(int i = 0; i < 10; i++)
			numbers[i] = input.nextInt();
		for(int i = 0; i < 10; i++)
		{
			if(!isOdd(numbers[i]) && !isEven(numbers[i]))
			{
				if(numbers[i] > max)
					max = numbers[i];
			}
		}
		return max;
	}
	
	public static boolean isSymmetrical(int number)
	{
		String str = "";
		int temp = number;
		while (number > 0)
		{
			str = str + number%10;
			number = number/10;		
		}
		int a = Integer.parseInt(str);
		if(Integer.parseInt(str) == temp)
			return true;
		else 
			return false;
		
	}
	
	public static int countSymmetricalNumbers()
	{
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter plus int numbers: ");
		int x = input.nextInt();
		while(x!=0)
		{
			if(isSymmetrical(x))
				count++;	
			x = input.nextInt();
		}
		return count;
	}
	
	public static int getGCD(int x, int y)
	{
		while(x!=0 && y!=0)
		{
			if(x > y)
				x = x % y;
			else
				y = y % x;
		}
		return x + y;
	}
	
	public static void main(String[] args) {
//		printLandingTime(4,1,1, 176400);
//		System.out.println(getMax());
//		System.out.println(countSymmetricalNumbers());
		System.out.println(getGCD(252, 105));
	}

}
