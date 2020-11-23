import java.util.Scanner;
public class MyArray {
	public static int[] next(int []ar, Scanner in) {
		for (int i=0;i<ar.length;i++) {
			ar[i]=in.nextInt();
		}
		return ar;
	}
	public static double[] next(double []ar, Scanner in) {
		for (int i=0;i<ar.length;i++) {
			ar[i]=in.nextDouble();
		}
		return ar;
	}
	public static A[] next(A []ar, Scanner in) {
		for (int i=0;i<ar.length;i++) {
			ar[i]=new A(in.nextInt());
		}
		return ar;
	}
	public static void print(int ar[]){
		for (int x: ar)
			System.out.print(x+" ");
		System.out.println();
	}
	public static void print(double ar[]){
		for (double x: ar)
			System.out.print(x+" ");
		System.out.println();
	}
	public static void print(A ar[]){
		for (A x: ar)
			x.printA();
	}
	public static int sum(int ar[]){
		int rsum=0;
		for (int x: ar)
			rsum=rsum+x;
		return rsum;
	}
	public static double sum(double ar[]){
		double rsum=0;
		for (double x: ar)
			rsum=rsum+x;
		return rsum;
	}
	public static int sum(A ar[]){
		int rsum=0;
		for (A x: ar)
			rsum=rsum+x.getA();
		return rsum;
	}
	public static boolean isEven(int number)
	{
		if((number%10)%2 == 0)
			return true;
		else
			return false;
	}
	
	public static void printEvenPositive(int [ ] numbers)
	{
		for(int i: numbers)
		{
			if(i > 0 && isEven(i))
				System.out.print(i + " ");
		}
	}
	
	public static int sumThreeDigitNums(int [] nums)
	{
		int sum = 0;
		for(int i: nums)
		{
			if(i > 99 && i < 1000)
				sum += i;			
		}
		return sum;
	}
	
	public static double average(int [] nums)
	{
		double sum = 0;
		for(int i: nums)
		{
			sum+=i;
		}
		return sum/nums.length;
	}
	
	public static double average(double [] nums)
	{
		double sum = 0;
		for(double i: nums)
		{
			sum+=i;
		}
		return sum/nums.length;
	}
	
	public static boolean symmetrical(int [] nums)
	{
		boolean b = false;
		int i = 0, j = nums.length-1;
		while(i < j)
		{
			if(nums[i] == nums[j])
			{
				b = true;
				i++;
				j--;
			}
			else return false;
		}
		return b;
	}
	
	public static boolean symmetrical(double [] nums)
	{
		boolean b = false;
		int i = 0, j = nums.length-1;
		while(i < j)
		{
			if(Math.abs(nums[i] - nums[j])< 0.001)
			{
				b = true;
				i++;
				j--;
			}
			else return false;
		}
		return b;
	}
	
	public static int max(int [] numbers)
	{
		int max = numbers[0];
		for(int i: numbers)
		{
			if(max < i)
				max = i;
		}
		return max;
	}
	
	public static double max(double [] numbers)
	{
		double max = numbers[0];
		for(double i: numbers)
		{
			if(max < i)
				max = i;
		}
		return max;
	}
	
	public static MyDate max(MyDate [] numbers)
	{
		MyDate max = numbers[0];
		for(MyDate i: numbers)
		{
			if(max.isOlder(i))
				max = i;
		}
		return max;
	}
	
	public static int countDateYear(MyDate [] dates, int year)
	{
		int count = 0;
		for(MyDate d: dates)
		{
			if(d.getYear() == year)
				count++;
		}
		return count;
	}
}
