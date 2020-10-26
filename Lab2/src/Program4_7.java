import java.util.Scanner;

public class Program4_7 {
	
	public static int isEven(int number)
	{
		int sum = 0;
		while (number > 0)
		{
			if((number%10)%2 == 0)
				sum += number%10;
			number = number/10;
		}
		return sum;
	}
	
	public static int isOdd(int number)
	{
		int sum = 0;
		while (number > 0)
		{
			if((number%10)%2 == 1)
				sum += number%10;
			number = number/10;
		}
		return sum;
	}
	
	public static int retDigitsSumCount(int number)
	{
		int sum = 0;
		if(number > 0)
			sum = isEven(number);
		else
			sum = isOdd(number*(-1));
		return sum;
			
	}

	public static void main(String[] args) {
		int x;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number: ");
		x = input.nextInt();
		System.out.println(retDigitsSumCount(x));
	}

}
