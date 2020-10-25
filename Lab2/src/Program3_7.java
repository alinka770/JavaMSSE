import java.util.Scanner;

public class Program3_7 {
	
	public static int getFactor(int number)
	{
		int res = 0;
		if(number >= 95)
			res = 100 - number;
		else if(number >= 86 && number < 95)
			res = 4;
		else if(number >= 56 && number < 86)
			res = 6;
		else 
			res = 0;
		return res;	
	}

	public static void main(String[] args) {
		
		int rate;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter rate: ");
		rate = input.nextInt();
		
		int dopR = getFactor(rate);
		
		System.out.print("Your rate is " + rate + ". Your extra points is " + dopR + ". Your final rate is " + (rate + dopR) + ".");
		

	}

}
