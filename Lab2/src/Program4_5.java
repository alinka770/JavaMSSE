import java.util.Scanner;

public class Program4_5 {
	
	public static void doFib(int n)
	{
		int a = 1;
		int b = 1, c;
		String str = a + " " + b + " ";
		for (int i = 2; i < n; i++)
		{	
			c = a + b;
			str = str + c + " ";
			a = b;
			b = c;		
		}
		System.out.println(str);
			
	}

	public static void main(String[] args) {
		
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number: ");
		number = input.nextInt();
		doFib(number);
	}

}
