import java.util.Scanner;

public class Program1_5 {
	
	
	public static void main(String[] args) {
		
		float number, floatnum;
		int intnum;
	
		Scanner input = new Scanner(System.in);
		System.out.println("����������, ������� ������������ �����: ");

		number = input.nextFloat();
		intnum = (int)number;
		
		floatnum = number - intnum;
		
		System.out.println("���� �����: " + number + ". ����� ����� ����� " + intnum + ". ������� ����� ����� " + floatnum + ". ");
	
	}
}
