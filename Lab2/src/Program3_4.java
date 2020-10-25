import java.util.Scanner;

public class Program3_4 {
	
	public static int do9Complement(int number)
	{
		int str = 0;
		for(int i = 1; i <= 1000; i*=10)
		{
			str += (9 - number%10) * i;
			number = number/10;
		}
		return str;
	}

	public static void main(String[] args) {
		
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter int number(4 digits): ");
		a = input.nextInt();

		System.out.print("Result : " + do9Complement(a));
	
	}
}
