import java.util.Scanner;

public class Program1_9 {

	public static void main(String[] args) {
		
		int number, e, d, s, t, dt;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите положительное целое пятизначное число: ");
		
		number = input.nextInt();
		e = number%10;
		d = (number/10)%10;
		s = (number/100)%10;
		t = (number/1000)%10;
		dt = (number/10000)%10;
		
		System.out.println(d + "" + e + "" + s + "" + dt + "" + t);
		

	}

}
