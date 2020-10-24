import java.util.Scanner;

public class Program1_10 {

	public static void main(String[] args) {
		
		float number;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите вещественное число: ");
		
		number = input.nextFloat();
		
		System.out.printf("%f; %.2f; %.4f", number, number, number);
		

	}

}
