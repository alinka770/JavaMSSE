//Hlazkova Alina 346316979
import java.io.*;

public class MainClass {
	
	public static String[] increaseLength(String[] arrStr)
	{
		   String[] tmp = new String[arrStr.length + 1];
		   for (int i = 0; i < arrStr.length; i++)
		      tmp[i] = arrStr[i];
		   arrStr = tmp;	
		 return arrStr;
	}
	
	public static Counter[] increaseLength(Counter[] wordsCount)
	{
		  Counter[] tmp = new Counter[wordsCount.length + 1];
		   for (int i = 0; i < wordsCount.length; i++){
		      tmp[i] = wordsCount[i];
		   }
		   wordsCount = tmp;
	       return wordsCount;
	}
	
	public static String[] readFile(String filename)
	{
		String[] arrStr = new String[0];
		int counter = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
		    String s;
		    while((s=br.readLine())!=null){
		    	   arrStr = increaseLength(arrStr);	
		    	   arrStr[counter] = s;
		    	   counter++;
		    }
		}
		 catch(IOException ex){	             
		    System.out.println(ex.getMessage());
		} 
		return arrStr;
	}
	
	public static String[] readFile2(String filename)
	{
		String[] temporary = null;
		try(BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
			String s1 = br.readLine();
			temporary = s1.split(" ");
		}
		 catch(IOException ex){	             
		    System.out.println(ex.getMessage());
		} 
		return temporary;
	}
	
	public static void writeFile(String[] array)
	{
		try
        {
			FileWriter writer = new FileWriter("out1.txt", false);
			PrintWriter pw = new PrintWriter(writer);
            for(String s: array)
            {
            	pw.println(s);
            }   
            pw.close();
            writer.close();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
	}
	
	
	public static void writeFile2(Counter[] array)
	{
		try
        {
			FileWriter writer = new FileWriter("out2.txt", false);
			PrintWriter pw = new PrintWriter(writer);
            for(Counter s: array)
            {
            	pw.print(s.print() + ",");
            }   
            pw.close();
            writer.close();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
	}
	public static void toValueOf(String a) throws GradeException
	{
		if(Integer.valueOf(a) < 0 || Integer.valueOf(a) > 100)
			throw new GradeException(Integer.valueOf(a));
	}

	public static String[] avg(String[] result)
	{
		String[] retArr = new String[result.length];
		for(int r = 0; r < result.length; r++)
		{		
			String toRet = "";
			String[] split = result[r].split(" ");
			if(split.length == 1)
				toRet += split[0] + " 0";
			else
			{
				toRet += split[0] + " ";
				double avg = 0;
				int count = 0;
				for(int i = 1; i < split.length; i++)
				{
					avg += Integer.valueOf(split[i]);
					count++;
				}
				toRet += avg/count;
			}
			retArr[r] = toRet;	
		}
		return retArr;
	}
	
	public static void calcAvg(String filename)
	{
		String[] array = readFile(filename);
		String[] result = new String[array.length];
		for(int i = 0; i < array.length; i++)
		{
			String resStr = "";
			String[] subjectGrades = array[i].split(" ");
			resStr += subjectGrades[0] + " ";
			for(int j = 1; j < subjectGrades.length; j++)
			{
				try{
					toValueOf(subjectGrades[j]);
				}
				catch(GradeException ex)
				{
					System.out.println(ex.toString());
					continue;
				}
				catch(NumberFormatException ex)
				{
					System.out.println(ex.toString());
					continue;
				} 
				resStr += subjectGrades[j] + " ";
				
			}
			result[i] = resStr;		
		}
		String[] resultAvg = avg(result);
		writeFile(resultAvg);
	}
	
	public static boolean ifContains(String[] arr, String word)
	{
		for(String a: arr)
		{
			if(a.toLowerCase().equals(word.toLowerCase()))
				return true;
		}
		return false;
	}
	
	public static boolean ifContainsPunctuation(String[] arr, String word)
	{
		for(String a: arr)
		{
			if(word.contains(a))
				return true;
		}
		return false;
	}
	
	
	public static String delPunctuation(String[] arr, String word)
	{
		String res = "";
		for(String a: arr)
		{
			if(word.contains(a))
				word = word.substring(0, word.indexOf(a)) + word.substring(word.indexOf(a) + a.length());
		}
		return word;
	}
	
	public static boolean ifContainsCounterArr(Counter[] wordsCount, String word)
	{
		for(Counter coun: wordsCount)
		{
			if(coun.getWord().equals(word))
				return true;				
		}
		return false;
	}
	
	public static Counter returnWordCounter(Counter[] wordsCount, String word)
	{
		Counter result = null;
		for(Counter coun: wordsCount)
		{
			if(coun.getWord().equals(word))
				result = coun; 
		}
		return result;
	}
	
	public static int counterW = 0;
	
	public static Counter[] ifContainsCounter(Counter[] wordsCount, String word)
	{
		if(wordsCount.length == 0)
		{
			   wordsCount = increaseLength(wordsCount);
			   wordsCount[counterW] = new Counter(word);
			   counterW++;
		}
		else 
		{
			if(!ifContainsCounterArr(wordsCount, word))
			{
				wordsCount = increaseLength(wordsCount);
				wordsCount[counterW] = new Counter(word);
				counterW++;
			}
		    else returnWordCounter(wordsCount, word).increaseCounter();			  				   
		}
		return wordsCount;
	}
	
	public static void countWord(String name1, String name2, String name3)
	{
		String[] firstFile = readFile(name1);
		String[] secondFile = readFile2(name2);
		String[] thirdFile = readFile2(name3);
		Counter[] wordsCount = new Counter[0];
		int counter = 0;
		for(String sent: firstFile)
		{
			String[] words = sent.split(" ");
			for(String word: words)
			{
				if(ifContainsPunctuation(thirdFile, word))
					word = delPunctuation(thirdFile, word);
				if(!ifContains(secondFile, word) && !ifContainsPunctuation(thirdFile, word))
					wordsCount = ifContainsCounter(wordsCount, word);
			}
		}
		writeFile2(wordsCount);	
	}

	public static void main(String[] args) {
	
		calcAvg("input.txt");
		countWord("1.txt", "2.txt", "3.txt");
	}

}
