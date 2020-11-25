import java.util.Scanner;
import java.util.Arrays;                                                  

public class TestLab4 {
	
	//1
	public static void  printStringInform(String str)
	{
		char[] arr = str.toCharArray();
		int countL = 0, countl = 0, countD = 0, countS = 0, countSym = 0;
		for(char c: arr)
		{
			if(Character.isUpperCase(c))
				countL++;
			else if(Character.isLowerCase(c))
				countl++;
			else if(Character.isDigit(c))
				countD++;
			else if(Character.isSpaceChar(c))
				countS++;	
			else
				countSym++;
		}
		System.out.println("letters: " + countl);
		System.out.println("Letters: " + countL);
		System.out.println("Digits: " + countD);
		System.out.println("Symlos: " + (countSym + countS));
		System.out.println("Words: " + (countS + 1));
		
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
	
	//6
	public static int compareStringInts(String a, String b)
	{
		int numA = Integer.parseInt(a);
		int numB = Integer.parseInt(b);
		
		if(numA > numB)
			return 1;
		else if(numB > numA)
			return -1;
		else
			return 0;
	}
	
	//7
	public static String modificationString(String str)
	{
		char[] arr = str.toCharArray();
		String newStr = "";
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if((i+1) == arr.length)
			{
				count++;
			    newStr += arr[i] + "" + count + "";
			}
			else if(arr[i] == arr[i+1])
			{	
				count++;
			}
			else
			{
				count++;
				newStr += arr[i] + "" + count + "";
				count = 0;
			}
		}
		return newStr;
	}
	//8
	public static String ChangeLettersCase(String str)
	{
		String newStr = "";
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
				newStr += Character.toLowerCase(str.charAt(i));
			else
				newStr += Character.toUpperCase(str.charAt(i));
		}
		return newStr;
	}
	//9
	public static void printDomain(String url)
	{
		String[] arr = url.split("\\.");
		for(int i = arr.length - 1; i >= 0; i--)
		{
			System.out.println(String.join(".", Arrays.asList(arr).subList(i, arr.length)));    		
		}
	}
	
	//10
	public static String replaceWord(String a, String b, String c)
	{
		if(a.contains(b))
		{
			a =  a.replace(b, c);
		}
		return a;
	}
	public static void main(String[] args) {
		//1
		printStringInform("aAbcd T45&$ 67Aa");
		//2
		System.out.println(reverseString("Abcd12$%^"));
		//3
		System.out.println(reverseWordString("abcd 1234 qwerty !@#$%^"));
		//4
		System.out.println(retLongWord("abdc ab qwerty zxc"));
		//5
		System.out.println(retLongWord1("abdc ab qwerty zxc"));
		//6
		System.out.println(compareStringInts("16345678", "12345678"));
		System.out.println(compareStringInts("16345678", "16345678"));
		//7
		System.out.println(modificationString("aaabbbb*zz@@@@@@r"));
		//8
		System.out.println(ChangeLettersCase("abcdDR RDxsEr T45$dEEr"));
		//9
		printDomain("www.sce.ac.il");
		//10
		System.out.println(replaceWord("abcsfdfabcabcqwertyabc","abc","12$$5"));
	}

}
