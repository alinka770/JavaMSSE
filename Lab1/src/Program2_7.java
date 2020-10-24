import java.util.Scanner;

public class Program2_7 {

	public static void main(String[] args) {
		
		int a, b, c, d;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите четыре натуральных числа: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		
		if (a + b == c + d  || a + c == b + d || a + d == b + c)
		{
			System.out.println("Great");
		}
		else 
		{
			System.out.println("Sorry");
		}

	}

}
