import java.util.Scanner;

public class Program1_7 {

	public static void main(String[] args) {
		
		float tempF, tempC;
		
		Scanner input = new Scanner(System.in);
		System.out.println("����������, ������� ����������� � �����������: ");
		
		tempF = input.nextFloat();
		
		tempC = (tempF - 32) * 5 / 9;
		
		System.out.println("����������� �� ���������� " + tempF + ", � ����������� �� ������� " + tempC + ". " );

	}

}
