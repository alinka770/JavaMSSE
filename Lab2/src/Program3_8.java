import java.util.Scanner;

public class Program3_8 {
	
	public static boolean sumDigits(int number)
	{
		int sum = 0;
		while (number > 0)
		{
			sum = sum + number%10;
			number = number/10;			
		}
		return (sum >= 10 && sum <= 99);
	}
	
	public static boolean anDigits(int e, int s, int d, int dt) 
	{
		if(s!=d && s!= e && s!= dt && d!=e && d!= dt && e!=dt)
			return true;
		else
			return false;
	}
	
	public static boolean evenOrNotEven(int e, int s, int d, int dt)
	{
		if ((s%2==0 || d%2==0 || e%2==0 || dt%2==0) && (s%2==1 || d%2==1 || e%2==1 || dt%2==1) )
			return true;
		else return false;
	}
	
	public static String checkPassword(int number)
	{
		int e = number%10;
		int d = (number/10)%10;
		int s = (number/100)%10;
		int dt = (number/1000)%10;	
		
		if(sumDigits(number) && anDigits(e, s, d, dt) && evenOrNotEven(e, s, d, dt))
			return "Yes";
		else
			return "No";
		
	}

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter int number(4 digits): ");
		number = input.nextInt();
		
		System.out.print(checkPassword(number));
	}

}
