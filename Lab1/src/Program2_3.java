import java.util.*;  
import java.util.Scanner;

public class Program2_3 {
	
	public static ArrayList<Integer> digits(int number)
	{
		int e, d, s;
		ArrayList<Integer> list = new ArrayList<Integer>();  
		e = number%10;
		d = (number/10)%10;
		s = (number/100)%10;
		list.add(e);
		list.add(d);
		list.add(s);
		
		return list;
	}

	public static void main(String[] args) {
		
		int number1, number2;
		ArrayList<Integer> list1 = new ArrayList<Integer>();  
		ArrayList<Integer> list2 = new ArrayList<Integer>();  

		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите два целых трёхзначных числа: ");
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		list1 = digits(number1);
		list2 = digits(number2);
		
		if(list1.contains(list2.get(0)))
		{
			if(list1.contains(list2.get(1)) && list2.get(0)!=list2.get(1))
			{
				if(list1.contains(list2.get(2)) && list2.get(1)!=list2.get(2))
				{
					System.out.println("Эти числа состоят из одинаковых чисел");
				}
				else
					System.out.println("Эти числа не состоят из одинаковых чисел");
			}
			else
				System.out.println("Эти числа не состоят из одинаковых чисел");
		}
		else
			System.out.println("Эти числа не состоят из одинаковых чисел");


	}

}
