import java.util.Scanner;

public class Program4_6 {
	
	public static void getAvg()
	{
		int x, y, count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number: ");
		x = input.nextInt();
		int sum = 0;
		do
		{
			y = x;
			sum += x;
			count++;
			System.out.print("Please enter number: ");
			x = input.nextInt();
		}
		while(y < x);
		double avg = (double)sum/count;
		System.out.print("Average: " + avg + ".");
	}

	public static void main(String[] args) {
		getAvg();
	}

}
