import java.util.Scanner;

public class Program2_4 {

	public static void main(String[] args) {

		int number, e, d, s, t, dt, ev = 0;
		String str = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Пожалуйста, введите целое пятизначное число: ");
		number = input.nextInt();
		
		e = number%10;
		d = (number/10)%10;
		s = (number/100)%10;
		t = (number/1000)%10;
		dt = (number/10000)%10;
		
		if (dt%2 == 0)
			{
				str = str + dt;
				ev++;
			}
		if(t%2 == 0)
			{
				str = str + t;
				ev++;
			}
		if(s%2 == 0)
			{
				str = str + s;
				ev++;
			}
		if(d%2 == 0)
			{
				str = str + d;
				ev++;
			}
		if(e%2 == 0)
			{
				str = str + e;
				ev++;
			}
		if(dt%2 != 0)
			str = str + dt;
		if(t%2 != 0)
			str = str + t;
		if(s%2 != 0)
			str = str + s;
		if(d%2 != 0)
			str = str + d;
		if(e%2 != 0)
			str = str + e;
		
		System.out.println("Новое число " + str + ". Количество чётных чисел в числе " + ev + ". ");
		
	}

}
