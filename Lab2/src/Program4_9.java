import java.util.Scanner;

public class Program4_9 {
	
	public static boolean isPrime(int number, int var)
	{
		if (number > 1)
		{
			for(int i = 2; i < number; i++)
			{
				if(number%i == 0)
					return false;
			}
		}
		else return false;
		return true;
	}
	

	public static void main(String[] args) {
		int x;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number: ");
		x = input.nextInt();
		
		if(isPrime(x, 2))
			System.out.println("Prime number");
		else
			System.out.println("Not prime number");

	}

}
