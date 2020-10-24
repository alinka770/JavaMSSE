import java.util.Scanner;

public class Program1_6 {

	public static void main(String[] args) {
		
		int number, e, d, s;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите число: ");
		
		number = input.nextInt();
		
		e = number%10;
		d = (number/10)%10;
		s = (number/100)%10;
		
		System.out.println(e + " " +  d + " " + s);
		
	}

}
