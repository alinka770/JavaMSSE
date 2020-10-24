import java.util.Scanner;

public class Program2_8 {

	public static void main(String[] args) {
		int day1, month1, year1, day2, month2, year2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the birthdate of the first person: ");
		System.out.print("Day: ");
		day1 = input.nextInt();
		System.out.print("Month: ");
		month1 = input.nextInt();
		System.out.print("Year: ");
		year1 = input.nextInt();
		System.out.println("Enter the birthdate of the second person: ");
		System.out.print("Day: ");
		day2 = input.nextInt();
		System.out.print("Month: ");
		month2 = input.nextInt();
		System.out.print("Year: ");
		year2 = input.nextInt();
		
		if(year1 > year2)
			System.out.println("The first person is younger.");
		else if (year1 < year2)
			System.out.println("The second person is younger.");
		else
		{
			if (month1 > month2)
				System.out.println("The first person is younger.");
			else if (month1 < month2)
				System.out.println("The second person is younger.");
			else
			{
				if (day1 > day2)
					System.out.println("The first person is younger.");
				else if (day1 < day2)
					System.out.println("The second person is younger.");
				else
					System.out.println("Persons was borned in the same date");
			}
		}
			

	}

}
