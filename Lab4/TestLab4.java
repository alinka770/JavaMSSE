import java.util.Scanner;

public class TestLab4 {
	
	//1
	public static void  printStringInform(String str)
	{
		
	}
	//2
	public static String reverseString(String str)
	{
		char[] arr = str.toCharArray();
		String newStr = "";
		for(int i = arr.length - 1; i >= 0; i-- )
		{
			newStr+=arr[i];
		}
		return newStr;
	}
	//3
	public static String reverseWordString(String str)
	{
		String[] arrStr = str.split(" ");
		String newStr = "";
		for(int i = 0; i < arrStr.length; i++)
		{
			newStr += reverseString(arrStr[i]) + " ";
		}
		return newStr;
	}
	//4
	public static String retLongWord(String str)
	{
		String[] strArr = str.split(" ");
		String newStr = "";
		for(int i = strArr.length-1; i >= 0; i--)
		{
			newStr += strArr[i] + " ";
		}
		return newStr;
	}
	
	public static int max(int[] arr)
	{
		int max = arr[0];
		int j = 0;
		for(int i = 1; i < arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
				j = i;
			}
		}
		return j;
	}
	//5
	public static String retLongWord1(String str)
	{
		String[] strArr = str.split(" ");
		int[] count = new int[strArr.length];
		for(int i = 0; i < strArr.length; i++)
		{
			count[i] = strArr[i].length();
		}
		
		return strArr[max(count)];
	}
	public static void main(String[] args) {

		System.out.println(reverseString("Abcd12$%^"));
		System.out.println(reverseWordString("abcd 1234 qwerty !@#$%^"));
		System.out.println(retLongWord("abdc ab qwerty zxc"));
		System.out.println(retLongWord1("abdc ab qwerty zxc"));
	}

}
