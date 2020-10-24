import java.util.Scanner;

public class Program1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, a1, a2, a3, a4;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter int number: ");
		a = input.nextInt();
		a1 = 2*a;
		a2 = a - 5;
		a3 = a/3;
		a4 = a%3;
		
		System.out.println(a1 + "; " + a2 + "; " + a3 + ";" + a4);
	}

}
