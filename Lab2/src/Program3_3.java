import java.util.Scanner;

public class Program3_3 {
	
	public static int max3Int(int a, int b, int c)
	{
		int max = a;
		if(a >= b && a>= c)
			max = a;
		else if (b >= a && b >= c)
			max = b;
		else
			max = c;
		return max;
	}

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 3 int number: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		System.out.print("The max number is : " + max3Int(a, b, c));
	
	}

}
