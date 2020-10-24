import java.util.Scanner;

public class Program1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; float f; double d; char c; long l;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the int number: ");
		i = input.nextInt();
		System.out.print("Please enter the float number: ");
		f = input.nextFloat();
		System.out.print("Please enter the double number: ");
		d = input.nextDouble();
		System.out.print("Please enter the char: ");
		c = input.next().charAt(0);
		System.out.print("Please enter the long number: ");
		l = input.nextLong();
		input.close();
		
		System.out.printf("It is your input: %d; %c; %.1f; %.1f; %d", l, c, d, f, i);
	}

}
