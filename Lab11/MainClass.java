//Hlazkova Alina 346316979
public class MainClass {
	
	/*String stringArrToString(String[]) - gets string array and return a String*/
	public static String stringArrToString(String[] arr)
	{
		String result = "";
		for(int c = 0; c < arr.length; c++)
		{
			if(c < arr.length - 1)
				result += arr[c] + "#";
			else
				result += arr[c];
		}
	    return result;		
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
	
	public static String calcAvg(String str)
	{
		String[] subjects = str.split("#");
		String[] subjectGrades = new String[subjects.length];
		String[] result = new String[subjects.length];
		for(int i = 0; i < result.length; i++)
		{
			String resStr = "";
			subjectGrades = subjects[i].split(" ");
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
		return stringArrToString(avg(result));
	}
	
	public static void main(String[] args) {
		String str = "Java 100 -10 23a 90 20.3#Cpp 125 -15";
		System.out.println(calcAvg(str));
		System.out.println("*******************************************");
		
		Student[] students = new Student[10];
		students[0] = new Student("Alina", 21, 100);
		students[3] = new Student("Alex", 35, 105);
		students[7] = new Student("Vasyliy", 18, 75);
		students[8] = new Student("Liza", 26, -4450);
		int counter = 0;
		System.out.println("Students with outstanding results: ");
		for(Student s: students)
		{
			try {
				if(!s.isOutStanding())
					throw new Exception();
				counter++;
				s.print();
			}
			catch(NullPointerException ex)
			{
				//System.out.println(ex.toString());
			} 
			catch (Exception e) {
				 // TODO Auto-generated catch block
			    //e.printStackTrace();
			}
		}
		System.out.println("Amount of this students " + counter);

		System.out.println("********************************************");
		MyDate date1 = new MyDate(32, 13, 1999);
		MyDate date2 = new MyDate(9, 9, 1999);
		MyDate date3 = new MyDate(1, 13, 1990);
		MyDate date4 = new MyDate(5, 5, 2500);
		
	}

}



