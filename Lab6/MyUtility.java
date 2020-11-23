import java.time.LocalDate;
import java.time.LocalDateTime;

public class MyUtility {
	public static int add(int x, int y) {
		return x+y;
	}
	public static double add(double x, double y) {
		return x+y;
	}
	public static A add(A x,A y){
		return new A(add(x.getA(),y.getA()));
	}
	public static A add(A x,int y){
		return new A(add(x.getA(),y));
	}	
	public static int mul(int x, int y) {
		return x*y;
	}	
	public static double mul(double x, double y) {
		return x*y;
	}
	public static int mul(A x,A y){
		return mul(x.getA(),y.getA());
	}	
	public static int inc(int x) {
		return x+1;
	}
	public static double inc(double x) {
		return x+1;
	}
	public static int square(int x) {
		return x*x;
	}
	public static double square(double x) {
		return x*x;
	}
	public static int pow(int x, int y) {
		int r=1;
		for(int i=0;i<y;i++)
			r*=x;
		return r;
	}	
	public static double pow(double x, int y) {
		double r=1;
		for(int i=0;i<y;i++)
			r*=x;
		return r;
	}
	
	public static int getOddDigits(int x)
	{
		int num = 0, i = 1;
		while (x > 0)
		{
			if((x%10)%2 == 1)
			{
				num += (x%10)*i;
				i = i*10;
				x = x/10;
			}
			else
				x = x/10;
		}
		return num;
		
	}
	
	public static int sumCount(int number)
	{
		int sum = 0;
		while (number > 0)
		{
			sum += number%10;
			number = number/10;
		}
		return sum;
			
	}
	
	public static int getMaxSumDigits(int a, int b, int c)
	{
		int sumA = sumCount(a);
		int sumB = sumCount(b);
		int sumC = sumCount(c);
		int max;
		if(sumA > sumB && sumA > sumC)
			max = a;
		else if(sumB > sumA && sumB > sumC)
			max = b;
		else
			max = c;
		return max;
			
	}
	
	public static boolean goldenNumber(int number)
	{
		boolean b = false;
		while (number/10 > 0)
		{
			int first = number%10;
			number = number/10;
			int second = number%10;
			if(first + 1 == second || first - 1 == second)
				b = true;
			else
				return false;
		}
		return b;
	}
	
	public static boolean contains(char[] arr, char elem)
	{
		boolean b = false;
		for(int i = 0; i< arr.length;i++)
		{
			if(arr[i]!=elem)
				b = false;
			else
				return true;
		}
		return b;
	}
	
	public static boolean sameDigit(int a, int b)
	{
		String strA = String.valueOf(a);
		String strB = String.valueOf(b);
		char[] arrA = strA.toCharArray();
		char[] arrB = strB.toCharArray();
		boolean bool = false;
		for(char c1: arrA)
		{
			if(MyUtility.contains(arrB, c1))
				bool = true;
			else return false;
				
		}
		return bool;
	}
	
	public static LocalDate forwardDays(LocalDate d,int a)
	{
		return d.plusDays(a);
		
	}
}
