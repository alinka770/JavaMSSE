//Hlazkova Alina teudat 346316979
import java.util.ArrayList;
import java.util.Scanner;

public class HW {
	/* Напишите функцию по имени printLandingTime, которая получает время старта
ракеты (часы, минуты,секунды), время полета в секундах и выводит на экран время
приземления ракеты (часы, минуты, секунды). printLandingTime2*/
	public static void printLandingTime2(int h, int m, int s, int timeF)
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
			System.out.printf("%d hours ", newH);
		else if(newH == 1)
			System.out.printf("%d hour ", newH);
		if(newM > 1)
			System.out.printf("%d minutes ", newM);
		else if(newM == 1)
			System.out.printf("%d minute ", newM);
		if(newS > 1)
			System.out.printf("%d seconds ", newS);
		else if(newS==1)
			System.out.printf("%d second ", newS);
		if(newM == 0 && newS == 0 && newH != 0)
			System.out.printf(" exactly ");
		if(days == 1)	
			{
				if(newH==0 && newM ==0 && newS==0)
					System.out.printf("%d day ", days);
				else
					System.out.printf(" (+%d day) ", days);
			}
		else if(days>1)
		{
			if(newH==0 && newM ==0 && newS==0)
				System.out.printf("%d days ", days);
			else
				System.out.printf("(+%d days)", days);
		}
		
		
	}
	
	/*Проверка числа на четность*/
	
	public static boolean isEven(int number)
	{
		while (number > 0)
		{
			if((number%10)%2 == 0)
			{
				number = number/10;
			}
			else 
				return false;
		}
		return true;
	}
	/*Проверка числа на нечетность*/
	
	public static boolean isOdd(int number)
	{
		while (number > 0)
		{
			if((number%10)%2 == 1)
			{
				number = number/10;
			}
			else 
				return false;
		}
		return true;
	}
	
/* Напишите функцию по имени getMax, которая получает от пользователя серию
серию из 10 целых положительных чисел и возвращает максимальное число, которое
состоит из четных и нечетных цифр.
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
	/*Функция для проверки числа на симметричность*/
	
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
	 Напишите функцию по имени countSymmetricalNumbers, которая которая
получает серию целых положительных чисел, значение 0 указывает на конец серии.
Функция должна вернуть количество симметричных чисел
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
	 Напишите функцию по имени getGCD, которая получает два целых положительных
числа и возвращает наибольший общий делитель этих двух целых чисел с помощью
Алгоритма Евклида.
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
		printLandingTime2(0,0,0, 1);  //1 second
		System.out.println("\n********");
		printLandingTime2(0,0,0, 30);  //30 seconds
		System.out.println("\n********");
		printLandingTime2(0,0,0, 60);  //1 minute
		System.out.println("\n********");
		printLandingTime2(0,0,0, 120); //2 minutes
		System.out.println("\n********");
		printLandingTime2(0,0,0, 7200);//2 hours exactly
		System.out.println("\n********");
		printLandingTime2(0,0,0, 3660);//1 hour, 1 minute
		System.out.println("\n********");
		printLandingTime2(0,0,0, 3661);//1 hour, 1 minute, 1 second
		System.out.println("\n********");
		printLandingTime2(0,0,0, 3690);//1 hour, 1 minute, 30 seconds
		System.out.println("\n********");
		printLandingTime2(0,0,0, 3720);//1 hour, 2 minutes
		System.out.println("\n********");
		printLandingTime2(0,0,0, 3730);//1 hour, 2 minutes, 10 seconds
		System.out.println("\n********");
		printLandingTime2(0,0,0, 86400);//1 day		
		System.out.println("\n********");
		printLandingTime2(0,0,0, 86401);//1 second (+1 day)
		System.out.println("\n********");
		printLandingTime2(0,0,0, 90000);//1 hour exactly(+1 day)
		System.out.println("\n********");
		printLandingTime2(0,0,0, 93600);//2 hours exactly(+1 day)
		System.out.println("\n********");
		printLandingTime2(0,0,0, 90061);//1 hour, 1 minute, 1 second (+ 1 day)
		System.out.println("\n********");
		printLandingTime2(0,0,0, 90125);//1 hour, 2 minutes, 5 seconds (+ 1 day)		
		System.out.println("\n********");
		printLandingTime2(0,0,0, 93725);//2 hours, 2 minutes, 5 seconds (+ 1 day)		
		System.out.println("\n********");
		printLandingTime2(0,0,0, 172800);//2 days
		System.out.println("\n********");
		printLandingTime2(0,0,0, 172801);//1 second (+2 days)
		System.out.println("\n********");
		printLandingTime2(0,0,0, 176400);//1 hour exactly(+2 days)
		System.out.println("\n********");
		printLandingTime2(0,0,0, 180000);//2 hours exactly(+ 2days)
		System.out.println("\n********");
		printLandingTime2(0,0,0, 180001);//2 hours, 1 second (+ 2 days)
		System.out.println("\n********");
		printLandingTime2(0,0,0, 180091);//2 hours, 1 minute, 31 seconds (+ 2 days)
		System.out.println("\n********");
		printLandingTime2(0,0,0, 180191);//2 hours, 3 minutes, 11 seconds (+ 2 days)
		
		char c = 'n';
		int h, m, s, time;
		Scanner input = new Scanner(System.in);
		System.out.println("\nDo you want to put yours time? If yes, press y, else press n");
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
			printLandingTime2 (h, m, s, time);
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
		
		input.close();		

	}

}
