import java.util.Scanner;

public class Program3_6 {
	
	public static int arrangedDigits(int number)
	{
		int e = number%10;
		int d = (number/10)%10;
		int s = (number/100)%10;
		int dt = (number/1000)%10;
		
		if(dt < d && dt < s && dt < e && s < d && s < e && d < e)
			return 1;
		else if(dt > d && dt > s && dt > e && s > d && s > e && d > e)
			return 2;
		else 
			return 3;
	}
	
	public static void main(String[] args) {

		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter int number(4 digits): ");
		a = input.nextInt();
		
		switch(arrangedDigits(a))
		{
			case 1:
				System.out.print("Numbers are in ascending order.");
				break;
			case 2:
				System.out.print("Numbers are in descending order.");
				break;
			case 3:
				System.out.print("Another case.");
				break;
				
		}
		
	}

}
