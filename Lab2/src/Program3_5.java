import java.util.Scanner;

public class Program3_5 {
	
	public static int sumDigits(int number)
	{
		int sum = 0;
		while (number > 0)
		{
			sum = sum + number%10;
			number = number/10;			
		}
		return sum;
	}

	public static boolean sumEven(int number)
	{
		int sum = sumDigits(number);
		if(sum%2 == 0)
			return true;
		else
			return false;
	}
	
//	public static int countDigits(int number)
//	{
//		int count = 0 ;
//		do {
//			count++;
//			number = number/10;
//		} while(number > 0);
//		return count;
//	}

	public static void main(String[] args) {

		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter int number(3 digits): ");
		a = input.nextInt();
		
//		int count = countDigits(a);
//		if (count == 3)
//			System.out.print("Result : " + sumEven(a));
//		else
//			System.out.print("Not correct enter");
		
		if (a >= 100 && a <= 999)
			System.out.print("Result : " + sumEven(a));
		else
			System.out.print("Not correct enter");	
	}

}
