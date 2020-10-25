import java.util.Scanner;

public class Program4_2 {
	
	public static void maxMin()
	{
		float x, min, max;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter float numbers: ");
		x = input.nextFloat();
		max = x;
		min = x;
		while(x != 0 ) {
			x = input.nextFloat();		
			if(x > max)
			{
				max = x;
			}
			else if (x < min)
			{
				min = x;
			}
		}
		System.out.print("Max number: " + max + ". Min number: " + min + ".");
	}

	public static void main(String[] args) {	
		maxMin();
	}

}
