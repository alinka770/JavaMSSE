import java.util.Scanner;

public class Program4_8 {

	public static boolean isSymmetrical(int number)
	{
		String str = "";
		int temp = number;
		while (number > 0)
		{
			str = str + number%10;
			number = number/10;		
		}
		int a = Integer.parseInt(str);
		if(Integer.parseInt(str) == temp)
			return true;
		else 
			return false;
		
	}
	
	public static void main(String[] args) {
		int x;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number: ");
		x = input.nextInt();
		if(isSymmetrical(x))
			System.out.println("The number is symmetrical");
		else
			System.out.println("The number is not symmetrical");

	}

}
