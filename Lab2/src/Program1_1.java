import java.util.Scanner;

public class Program1_1 {

	public static void  op2Nums (int a, int b)
	{
		int sum = a + b;
		int diff = a - b;
		int mult = a * b;
		System.out.println("Sum " + sum);
		System.out.println("Difference " + diff);
		System.out.println("Multiply " + mult);
	}
	
	public static void main(String[] args) {
		
		int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 2 int number: ");
		a = input.nextInt();
		b = input.nextInt();
		
		op2Nums(a, b);
	}

}
