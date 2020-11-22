//Hlazkova Alina teudat 346316979
import java.util.ArrayList;
import java.util.Scanner;

public class HW {
	/* �������� ������� �� ����� printLandingTime, ������� �������� ����� ������
������ (����, ������,�������), ����� ������ � �������� � ������� �� ����� �����
����������� ������ (����, ������, �������) .*/
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
					System.out.printf("%d seconds%n",  newS);
				else if(newS == 1)
					System.out.printf("%d second%n", newS);
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
						System.out.printf("%d seconds  (+%d day) %n",  newS, days);
					else if(newS == 1)
						System.out.printf("%d second  (+%d day) %n", newS, days);
					else
						System.out.printf("%d day %n", days);
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
						System.out.printf("%d seconds  (+%d days) %n",  newS, days);
					else if(newS == 1)
						System.out.printf("%d second  (+%d days) %n", newS, days);
					else
						System.out.printf("%d days%n", days);
				}
			}
	}
	
	/*�������� ����� �� ��������*/
	
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
	/*�������� ����� �� ����������*/
	
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
	
/* �������� ������� �� ����� getMax, ������� �������� �� ������������ �����
����� �� 10 ����� ������������� ����� � ���������� ������������ �����, �������
������� �� ������ � �������� ����.
 */
	
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
	/*������� ��� �������� ����� �� ��������������*/
	
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
	/*
	 �������� ������� �� ����� countSymmetricalNumbers, ������� �������
�������� ����� ����� ������������� �����, �������� 0 ��������� �� ����� �����.
������� ������ ������� ���������� ������������ �����
	 */
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
	/*
	 �������� ������� �� ����� getGCD, ������� �������� ��� ����� �������������
����� � ���������� ���������� ����� �������� ���� ���� ����� ����� � �������
��������� �������.
*/
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
		System.out.println("Working function printingLandTime\n");
		System.out.println("----------------------------------------------\n");
		printLandingTime(0,0,0, 1);  //1 second
		printLandingTime(0,0,0, 30);  //30 seconds
		printLandingTime(0,0,0, 60);  //1 minute
		printLandingTime(0,0,0, 120); //2 minutes
		printLandingTime(0,0,0, 3660);//1 hour, 1 minute
		printLandingTime(0,0,0, 3661);//1 hour, 1 minute, 1 second
		printLandingTime(0,0,0, 3690);//1 hour, 1 minute, 30 seconds
		printLandingTime(0,0,0, 3720);//1 hour, 2 minutes
		printLandingTime(0,0,0, 3730);//1 hour, 2 minutes, 10 seconds
		printLandingTime(0,0,0, 86400);//1 day		
		printLandingTime(0,0,0, 86401);//1 second (+1 day)
		printLandingTime(0,0,0, 90000);//1 hour exactly(+1 day)
		printLandingTime(0,0,0, 93600);//2 hours exactly(+1 day)
		printLandingTime(0,0,0, 90061);//1 hour, 1 minute, 1 second (+ 1 day)
		printLandingTime(0,0,0, 90125);//1 hour, 2 minutes, 5 seconds (+ 1 day)		
		printLandingTime(0,0,0, 93725);//2 hours, 2 minutes, 5 seconds (+ 1 day)		
		printLandingTime(0,0,0, 172800);//2 days
		printLandingTime(0,0,0, 172801);//1 second (+2 days)
		printLandingTime(0,0,0, 176400);//1 hour (+2 days)
		printLandingTime(0,0,0, 180000);//2 hours (+ 2days)
		printLandingTime(0,0,0, 180001);//2 hours, 1 second (+ 2 days)
		printLandingTime(0,0,0, 180091);//2 hours, 1 minute, 31 seconds (+ 2 days)
		printLandingTime(0,0,0, 180191);//2 hours, 3 minutes, 11 seconds (+ 2 days)
		
		char c = 'n';
		int h, m, s, time;
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to put yours time? If yes, press y, else press n");
		c = input.next().charAt(0);
		if(c == 'y')
		{
			System.out.println("Please input hours");
			h = input.nextInt();
			System.out.println("Please input minutes");
			m = input.nextInt();
			System.out.println("Please input seconds");
			s = input.nextInt();
			System.out.println("Please input time of flight");
			time = input.nextInt();
			printLandingTime(h, m, s, time);
		}
		System.out.println("\n----------------------------------------------\n");
		System.out.println("Result of working function getMax()\n");
		System.out.println("\nResult:    " + getMax());
		System.out.println("\n----------------------------------------------\n");
		System.out.println("Result of working function countSymmetricalNumbers()\n");
		System.out.println("Result:   " + countSymmetricalNumbers());
		System.out.println("\n----------------------------------------------\n");
		System.out.println("Result of working function getGCD()\n");
		System.out.println("\n----------------------------------------------\n");
		System.out.println("Please, input two plus int numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("\nResult:   " + getGCD(a, b));
		System.out.println("\n----------------------------------------------\n");
		System.out.println("Creating examples of class ComplexNum and printing them\n");
		System.out.println("\n**********************************************\n");
		ComplexNum comp = new ComplexNum();
		comp.printComplex();
		
		ComplexNum comp1 = new ComplexNum(3, 4);
		comp1.printComplex();
		ComplexNum comp2 = new ComplexNum(3, -4);
		comp2.printComplex();
		ComplexNum comp3 = new ComplexNum(-3, -4);
		comp3.printComplex();
		ComplexNum comp4 = new ComplexNum(-3, 4);
		comp4.printComplex();
		ComplexNum comp5 = new ComplexNum(0, -4);
		comp5.printComplex();
		ComplexNum comp6 = new ComplexNum(3, 0);
		comp6.printComplex();
		ComplexNum comp7 = new ComplexNum(comp2);
		comp7.printComplex();
		ComplexNum comp8 = new ComplexNum(4, 3);
		comp8.printComplex();
		System.out.println("Result of function get absolute for 3 + 4i:   "  + comp7.getAbsolute());
		System.out.println("\n**********************************************\n");
		System.out.println("Result of function addComplex for 3 + 4i and 3 - 4i: " );
		comp1.addComplex(comp2).printComplex();
		System.out.println("\n**********************************************\n");
		System.out.println("Result of function addComplex for -3 + 4i and 3 + 4i: " );
		comp1.addComplex(comp4).printComplex();
		System.out.println("\n**********************************************\n");
		System.out.println("Result of function addComplex for 3 + 4i and 4 + 3i: " );
		comp1.addComplex(comp8).printComplex();
		System.out.println("\n**********************************************\n");
		System.out.println("Result of function equal for comp1 and comp2: " + comp1.equal(comp2));
		System.out.println("\n**********************************************\n");
		System.out.println("Result of function equal for comp7 and comp2: " + comp2.equal(comp7));
		System.out.println("\n**********************************************\n");
		System.out.println("Change the comp1 from 3 + 4i to 15 + 15i");
		comp1.printComplex();
		comp1.setImage(15);
		comp1.setReal(15);
		comp1.printComplex();
		System.out.println("\n**********************************************\n");
		System.out.println("Print the real of comp4 "  + comp4.getReal() +  " and image " + comp4.getImage());
		System.out.println("\n**********************************************\n");

	}

}
