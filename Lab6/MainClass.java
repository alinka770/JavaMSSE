import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		System.out.println(MyUtility.getOddDigits(123456789)); //13579
		System.out.println(MyUtility.getMaxSumDigits(1234, 9232, 5235));
		System.out.println(MyUtility.goldenNumber(5433));//false
		System.out.println(MyUtility.goldenNumber(5432));//true
		
		int [] numbers = new int[10];
		for(int i =0; i< 10; i++)
			numbers[i] = (i-5);
		MyArray.printEvenPositive(numbers);
		System.out.println();
		int [] nums = {1, 234, 67, 765, 900, 1, 5};
		System.out.println(MyArray.sumThreeDigitNums(nums));
		
		System.out.println(MyArray.average(nums));
		
		double [] nums1 = {1.5, 2.5, 6.5, 8.5};
		System.out.println(MyArray.average(nums1));
		
		int[] nums2 = {1, 2, 3, 3, 2, 1};
		System.out.println(MyArray.symmetrical(nums2));
		
		double[] nums3 = {1.2, 3.4, 5.6, 6.5, 3.4, 1.2};
		System.out.println(MyArray.symmetrical(nums3));
		double[] nums4 = {1.2, 3.4, 5.6, 5.6, 3.4, 1.2};
		System.out.println(MyArray.symmetrical(nums4));
		
		System.out.println(MyArray.max(nums));
		System.out.println(MyArray.max(nums3));
		
		MyDate[] dates = {new MyDate(9, 9, 1999), new MyDate(11, 7, 2009), new MyDate(6, 7, 1990), new MyDate(15, 7, 1960), new MyDate(6,9, 1999), new MyDate(5,5,1999)};
		MyArray.max(dates).printDate();
		System.out.println();
		
		System.out.println(MyArray.countDateYear(dates, 1999));
		
		System.out.println(MyUtility.forwardDays(LocalDate.of(2020, 12, 30), 3).toString());
		
		System.out.println(MyUtility.sameDigit(325314, 41532)); //true
//		System.out.println("Result: "+MyUtility.add(2, 3));
//		System.out.println("Result: "+MyUtility.add(2.5, 3.8));	
//		System.out.println("Result: "+MyUtility.mul(MyUtility.add(2, MyUtility.add(3, MyUtility.inc(4))),MyUtility.square(3)));
//		MyUtility.add(new A(2), new A(4)).printA();
//		MyUtility.add(new A(2), 4).printA();
//		System.out.println("A object count: "+A.getCount());
		Scanner input =new Scanner(System.in);
/*
		System.out.print("Enter int numbers : ");	
		int arr1[]=new int[5];
		MyArray.next(arr1, input);
		System.out.print("The values : ");	
		MyArray.print(arr1);
		System.out.println("The sum of ints : "+MyArray.sum(arr1));	
*/
/*
		System.out.print("Enter Double numbers : ");	
		double arr2[]=new double[6];
		MyArray.next(arr2,input);
		System.out.print("The values : ");	
		MyArray.print(arr2);
		System.out.println("The sum of doubles : "+MyArray.sum(arr2));	
*/
/*
		System.out.print("Enter A numbers : ");	
		A arr3[]=new A[4];
		MyArray.next(arr3,input);
		System.out.print("The values : ");	
		MyArray.print(arr3);
		System.out.println("The sum of A`s : "+MyArray.sum(arr3));	
		System.out.println("A object count: "+A.getCount());
*/
		input.close();		
		
	}
}
