import java.util.Scanner;

public class Program1_7 {

	public static void main(String[] args) {
		
		float tempF, tempC;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите температуру в Фаренгейтах: ");
		
		tempF = input.nextFloat();
		
		tempC = (tempF - 32) * 5 / 9;
		
		System.out.println("Температуру по Фаренгейту " + tempF + ", а температура по Цельсию " + tempC + ". " );

	}

}
