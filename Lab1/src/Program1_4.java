import java.util.Scanner;

public class Program1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year1, year2, maxYear, minYear, answer;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Пожалуйста, введите 2 четырехзначных числа: ");
		year1 = input.nextInt();
		year2 = input.nextInt();
		
		maxYear = Math.max(year1, year2);
		minYear = Math.min(year1, year2);
		answer = maxYear - minYear;
		
		System.out.println(answer);
	}

}
