import java.util.Scanner;

public class Program3_2 {
	
	public static int sumDigits(int number)
	{
//		int e = number%10;
//		int d = (number/10)%10;
//		int s = (number/100)%10;
//		return (e + d + s);
		
		int sum = 0;
		while (number > 0)
		{
			sum = sum + number%10;
			number = number/10;			
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 2 int number(3 digits): ");
		a = input.nextInt();
		b = input.nextInt();
		
		if(sumDigits(a) > sumDigits(b))	
			System.out.print("The number with a biggest sum : " + a);   
		else
			System.out.print("The number with a biggest sum : " + b);  
	}

}
