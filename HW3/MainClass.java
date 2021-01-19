//Hlazkova Alina 346316979
import java.util.Arrays;

public class MainClass {
	
	/*sortString, которая получает строку в
виде слов из маленьких букв, разделенных пробелом и возвращает новую строку из
этих же слов упорядоченных по длинне слова. Если есть несколько слов одинаковой
длинны их нужно упорядочить по лексикографическому порядку.
String sortString(String)*/
	
	public static String sortString(String str)
	{
		String retStr = "";
		String[] strSplit = str.split(" ");
		for (int i = strSplit.length - 1; i > 0; i--) {
	        for (int j = 0; j < i; j++) {
	            if (strSplit[j].length() > strSplit[j + 1].length()) {
	                String max = strSplit[j];
	                strSplit[j] = strSplit[j + 1];
	                strSplit[j + 1] = max;
	            }
	            else if(strSplit[j].length() == strSplit[j+1].length() && strSplit[j].compareTo(strSplit[j+1]) > 0)
	            {
	            	String max = strSplit[j];
	                strSplit[j] = strSplit[j + 1];
	                strSplit[j + 1] = max;
	            }
	        }
		}
		for(String s: strSplit)
			retStr = retStr +  s + " ";
		
		return retStr;
	}
	
	/*boolean checkPassw(String) 
	 * получает строку,
проверяет если её можно использовать в виде пароля и возвращает true или false.
Паролем может быть строка длинной больше 7 символов состоящая из: больших и
маленьких букв, цифр и одним из четырех символов-!@#$ и не содержащая любых
других знаков. */
	
	public static boolean checkPassw(String str)
	{
		int countCapitalLetters = 0, countLittleLetters = 0, countDigits = 0, countSymbols = 0, countOtherSymbols = 0;
		boolean result = true;
		if(str.length() <= 7) {
			System.out.println("short password");
			result = false;
		}
		for(char c : str.toCharArray())
		{
			if(c >= 'A' && c <= 'Z')
				countCapitalLetters++;
			else if(c >= 'a' && c <= 'z')
				countLittleLetters++;
			else if(c >= '0'  && c <= '9')
				countDigits++;
			else if(c=='!' || c=='@' || c=='#' || c == '$')
				countSymbols++;	
			else
				countOtherSymbols++;
				
		}
		if(countCapitalLetters == 0) 
		{
			System.out.println("no capital letters");
			result = false;
		}
		if(countLittleLetters == 0)
		{
			System.out.println("no little letters");
			result = false;
		}
		if(countDigits == 0)
		{
			System.out.println("no digits");
			result = false;
		}
		if(countSymbols == 0)
		{
			System.out.println("no symbols");
			result = false;
		}
		if(countOtherSymbols > 0)
		{
			System.out.println("have other symbols");
			result = false;
		}
		return result;
	}

	/*addLongInt, которая получает два целых
числа любой длины в виде двух отдельных строк и возвращает сумму этих чисел в
виде строки.
String addLongInt(String, String)*/
	
	public static String addLongInt(String str1, String str2)
	{
	    int maximum = str2.length();
	    if(str1.length() > str2.length())
	      maximum = str1.length();
	    int[] result = new int[maximum + 1];
	    int lenRes = result.length;
	    int ex = 0;
	    
	    for(int i = str1.length()-1; i>=0; i--)
	    {
	      result[lenRes - 1] = str1.charAt(i) - 48;
	      lenRes--;
	    }
	    
	    int j  = str2.length()-1;
	    for(int i = result.length-1; i>=0; i--)
	    {
	      int oper2 = 0;
	      if(j<0)
	        oper2 = 0;
	      else oper2 = str2.charAt(j) - 48;
	      int res = result[i] + oper2 + ex;
	      if(res >= 10 && i!=1)
	      {
	        ex = res/10;
	        result[i] = res - 10;
	      }
	      else if(res>=10 && i==1)
	      {
	        result[i] = res - 10;
	        result[i-1] = res/10;
	        break;
	      }
	      else
	      {
	        result[i] = res;
	        ex = 0;
	      }
	      j--;
	    }
	    String strRes = "";
	    if(result[0]==0)
	    {
	      for(int i = 1; i < result.length; i++)
	        strRes += result[i];
	    }
	    else
	      for(int i = 0; i < result.length; i++)
	        strRes += result[i];
	    return strRes;
	}
	
	/*char[] sortLettersString(char[]) - sort letters in words - alphabet*/
	public static char[] sortLettersString(char[] arr)
	{
		for (int i = arr.length - 1; i > 0; i--) {
	        for (int j = 0; j < i; j++) {
	            if (arr[j] > arr[j+1]) {
	                char max = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = max;
	            }
	        }
		}
		return arr;
	}
	
	/*String charArrString(char[]) - gets char array and returns a string*/
	public static String charArrToString(char[] arr)
	{
		String result = "";
		for(char c: arr)
			result += c;
	    return result;		
	}
	
	/*String stringArrToString(String[]) - gets string array and return a String*/
	public static String stringArrToString(String[] arr)
	{
		String result = "";
		for(String c: arr)
			result += c;
	    return result;		
	}
	
	/*Boolean[] fillBoolean(Boolean[]) - gets boolean array and return boolean array with all parametrs = false*/
	public static Boolean[] fillBoolean(Boolean[] arr)
	{
		for(int b = 0; b < arr.length; b++)
		{
			arr[b] = false;
		}
		return arr;
	}
	
	/*printAnagram, которая получает строку в
виде слов из маленьких и больших букв, разделенных пробелом, находит и печатает
слова Анаграммы (слова, состоящие из одинаковых букв) или сообщение, что такие
слова не найдены.
void printAnagram(String)*/
	
	public static void printAnagram(String str)
	{
		String[] strArr = str.split(" ");
		Boolean[] booleanArr = new Boolean[strArr.length];
		String[] strArrSort = new String[strArr.length];
		String[] resultStrings = new String[strArr.length];
		int count = 0, iterator = 0;
		String result = "";
		
		for(int i = 0; i < strArr.length; i++)
		{
			strArrSort[i] = charArrToString(sortLettersString(strArr[i].toLowerCase().toCharArray()));
		}
		for(int i = 0; i < strArr.length; i++)
		{
			if(stringArrToString(resultStrings).contains(strArr[i]))
				continue;
			result = "";
			booleanArr = fillBoolean(booleanArr);
			for(int j = i + 1; j < strArr.length; j++)
			{
				if(strArrSort[i].toString().equals(strArrSort[j].toString()))
				{
					booleanArr[i] = true;
					booleanArr[j] = true;
					count++;
				}
			}
			for(int k = 0; k < strArr.length; k++)
			{
				if(booleanArr[k])
					result += strArr[k] + " ";
			}
			
			if(result!="")
			{
				System.out.println(result);
				resultStrings[iterator] = result;
				iterator++;
			}
		}
		if(count == 0)
			System.out.println("Anagram not found");
		
	}
	
	/*boolean ifDomenInEmail(String, domen) - check if string contains a blocked domen*/
	public static boolean ifDomenInEmail(String str, String domen)
	{
		String[] domens = domen.split(" ");
		for(String d: domens)
		{
			if(str.contains(d))
				return false;
		}
		return true;
	}
	
	/*selectCorrectEmails, которая получает
строку состоящую из электронных почтовых адресов, разделенных пробелом, и
строку запрещенных доменных имен, разделенных пробелом. */
	
	public static String selectCorrectEmails(String email, String notDomen)
	{
		String[] emailArr = email.split(" ");
		String result = "";
		for(String s: emailArr)
		{
			if(s.contains("@"))
			{
				String[] str = s.split("@");
				if(str.length == 2 && str[1].contains(".") && ifDomenInEmail(str[1], notDomen))
				{
					result += s + " ";
				}									
			}
		}
		
		return result;
	}
	
/*и printCourse, которая получает массив из
объектов и название курса. Функция должна распечатать данные всех
преподавателей а затем студентов этого курса.*/
	
	public static void printCourse(Person[] array, String course)
	{
		System.out.println("Teachers");
		for(Person p: array)
		{
			if(p instanceof ITeacher && !(p instanceof Instructor) && stringArrToString(((ITeacher) p).getTeachCourse_list()).contains(course))
			{	
				p.print();
				System.out.println("************************************");				
			}
		}
		System.out.println("Students");
		for(Person p: array)
		{	
			if(p instanceof IStudent && stringArrToString(((IStudent) p).getStudentCourse_list()).contains(course))
			{
				p.print();
				System.out.println("**************************************");
			}
		}
	}
	
	/*int findMax(int[]) - find max in int Array*/
	public static int findMax(int[] hoursArr)
	{
		int max = hoursArr[0];
		int result = 0;
		for(int i = 1; i < hoursArr.length; i++)
		{
			if(max < hoursArr[i])
			{
				max = hoursArr[i];
				result = i;
			}
		}
		return result;
	}
	
	/*print2MaxHoursPresent, которая
получает массив из объектов и распечатывает данные двух человек, которые
находятся в колледже больше всего времени */
	
	public static void print2MaxHoursPresent(Person[] array)
	{
		System.out.println("Max hours present: ");
		int[] hoursArr = new int[array.length];
		int counter = 0;
		for(Person p: array)
		{
			if(p instanceof IHours)
			{
				hoursArr[counter] = ((IHours) p).getAllHours(); 
				counter++;
			}
		}
		int max1 = findMax(hoursArr);
		int[] hoursArrWithoutMax = new int[array.length];
		for(int i=0; i < hoursArrWithoutMax.length; i++)
		{
			if(i != max1)
				hoursArrWithoutMax[i] = hoursArr[i];
			else
				hoursArrWithoutMax[i] = -1;
		}
		int max2 = findMax(hoursArrWithoutMax);
		
		array[max1].print();
		System.out.println("************************************");
		array[max2].print();
		System.out.println("************************************");		
	}
	
	/*returnMaxTeachHours, которая получает
массив из объектов и возвращает тот объект, у которого самое большое количество
часов преподавания и часов практических занятий.*/
	
	public static Person returnMaxTeachHours(Person[] array)
	{
		int[] hoursArr = new int[array.length];
		int counter = 0;
		for(Person p: array)
		{
			if(p instanceof ITeacher)
				hoursArr[counter] = ((ITeacher) p).getTeachHours();
			else
				hoursArr[counter] = 0;
			counter++;
		}
		int max = findMax(hoursArr);
		return array[max];		
	}
	
	/*sumCourseTeachHours, которая
получает массив из объектов и название курса. Функция должна вернуть общее
количество часов преподавания для всех преподавателей этого курса.*/
	
	public static int sumCourseTeachHours(Person[] array, String course)
	{
		int sumHours = 0;
		for(Person p: array)
		{
			if(p instanceof ITeacher && stringArrToString(((ITeacher) p).getTeachCourse_list()).contains(course))
			{
				sumHours += ((ITeacher) p).getTeachHours();
			}
		}
		return sumHours;
	}
	
	/*countCourseStudents, которая получает
массив из объектов и название курса. Функция должна вернуть количество
студентов этого курса.*/
	
	public static int countCourseStudents(Person[] array, String course)
	{
		int countCourses = 0;
		for(Person p: array)
		{
			if(p instanceof IStudent && stringArrToString(((IStudent) p).getStudentCourse_list()).contains(course))
				countCourses++;
		}
		return countCourses;
	}
	
	public static void main(String[] args) {
		
		System.out.println("#Q1");
		System.out.println(sortString("bdcs aab aaa aaaad aaaaz abcd"));
		System.out.println("#Q2");
		System.out.println("correct password: "+checkPassw("abcd"));
		System.out.println("correct password: "+checkPassw("A12b@cdCD"));
		System.out.println("correct password: "+checkPassw("A1b@cdC*"));
		System.out.println("correct password: "+checkPassw("A1b@cdC"));
		System.out.println("#Q3");
		System.out.println(addLongInt("12345","49265"));
		System.out.println(addLongInt("12345","999999"));
		System.out.println(addLongInt("143753453223445734","76543322334487238"));
		System.out.println("#Q4");
		printAnagram("AngereD Table Pat eNraged letter taP ATP atpk");
		printAnagram("Table stRing letter");
		System.out.println("#Q5");
		System.out.println(selectCorrectEmails("aaa@bbb.com aaaa aaa@bbb.ccc.tmp aaa@aaa.temp aaa@bbb test@gmail.com","tmp aaa.temp"));
		System.out.println("#Q6");
		Person[] array={new Student("David",18,"java ppl c# db"),
		new StudentInstructor("Avi",12,"java ppl db",2,"c#"),
		new Student("Moty",20,"ppl c# db math"),new Student("Tali",12,"java db"),
		new StudentInstructor("Nensi",18,"ppl c# db",4,"java"),new Student("Ronit",24,"ppl db java math c#"),
		new Worker("Natan",42,"electrician"),new Worker("Fima",40,"worker"),
		new Professor("Alona",18,"java db network"), new Professor("Marina",12,"ppl"),
		new WorkerInstructor("Vlad",40,"it_project_manager",8,"testing db"),
		new WorkerInstructor("Guy",20,"engineer",8,"testing c#"),
		new Instructor("Yael",6,"logics c#"), new ProfessorInstructor("Michael",3,"c#",7,"java ppl")};
		printCourse(array,"java");
		print2MaxHoursPresent(array);
		System.out.println("max teaching hours:");
		returnMaxTeachHours(array).print();
		System.out.println("**********************************************");
		System.out.println("Course Teach hours: "+ sumCourseTeachHours(array,"java"));
		System.out.println("Course Students amount: "+ countCourseStudents(array,"java"));
	}

}
