import java.util.Scanner;


public class Program2_1 {

	public static void main(String[] args) {
		
		int height;
		double weight, bmi, heightM;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите ваш вес в кг: ");
		weight = input.nextFloat();
		System.out.println("Пожалуйста, введите свой рост в см: ");
		height = input.nextInt();

		bmi = weight / Math.pow(height / 100.0, 2.0);

		if (bmi <= 16)
		{
			System.out.print("Выраженный дефицит массы тела");
		}
		else if(bmi > 16 && bmi <= 18.5)
		{
			System.out.print("Дефицит массы тела");
		}
		else if(bmi > 18.5 && bmi <= 24.99)
		{
			System.out.print("Норма");
		}
		else if(bmi >= 25 && bmi <= 30)
		{
			System.out.print("Избыточная масса тела");
		}
		else if(bmi > 30 && bmi <= 35)
		{
			System.out.print("Ожирение");
		}
		else if(bmi > 35 && bmi <= 40)
		{
			System.out.print("Резкое ожирение");
		}
		else
		{
			System.out.print("Очень резкое ожирение");
		}

	}

}
