import java.util.Scanner;

public class Program4_3 {
	
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

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number: ");
		number = input.nextInt();
		
		if(isOdd(number))	
			System.out.print("The number consists of odd numbers.");
		else if(isEven(number))
			System.out.print("The number consists of even numbers.");
		else
			System.out.print("The number consists of even and odd numbers.");
	}

}
