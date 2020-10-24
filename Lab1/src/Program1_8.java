import java.util.Scanner;

public class Program1_8 {
	
	public static void main(String[] args) {
		
		int number, e, d, s;
		String [] strnum;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите положительное целое трехзначное число: ");
		
		number = input.nextInt();
		e = number%10;
		d = (number/10)%10;
		s = (number/100)%10;
		
		
		System.out.println(e + "" + d + "" + s);	
		
		System.out.println(e*100 + d*10+s);
	}

}
