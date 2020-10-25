import java.util.Scanner;

public class Program4_4 {
	
	public static int  count4Int()
	{
		int count = 0;
		for(int i = 1000; i < 10000; i++)
		{
			if (i%7 == 0 || (i%11 == 2 || i%11 == 3) || i%10 != 8)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println(count4Int());

	}

}
