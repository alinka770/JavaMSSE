import java.util.Scanner;

public class Program4_1 {
	
	public static int doPow(int x, int y)
	{
		int result = 1;
		for (int i = 0; i < y; i++)
		{
			result = result * x;
		}
		return result;
	}

	public static void main(String[] args) {
		
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 2 int numbers: ");
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.print("Result: " +  doPow(a, b));

	}

}
