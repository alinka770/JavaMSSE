import java.util.Scanner;

public class Program1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		double average;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 3 int number: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		input.close();
		
		average = (a + b + c) / 3;
		System.out.println("Average is " + average);
	}

}
