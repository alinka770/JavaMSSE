import java.util.Scanner;

public class Program2_6 {

	public static void main(String[] args) {
		
		float number;
		int sale = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите сумму покупки без скидки: ");
		number = input.nextFloat();
		
		if (number < 200)
			sale = 10;
		else if (number >= 200 && number < 400)
			sale = 20;
		else if (number >= 400 && number < 600)
			sale = 30;
		else
			sale = 40;
		
		double result = number * (100 - sale) / 100.0;
		System.out.println("Итоговая сумма со скидкой: " + result);

	}

}
