//Hlazkova Alina 346316979
public class Utility {
	/* printArray, которая получает массив целых чисел и распечатывает его на
экран для проверки следующих четырех функций:
void printArray(int[ ])*/
	public static void printArray(int[] arr)
	{
		for(int i: arr)
			System.out.print(i + " ");
	}
	/* shiftRight, которая получает массив
целых чисел и сдвигает числа в массиве по кругу на одно место в правую сторону.
void shiftRight(int[ ])*/

	public static void shiftRight(int[] arr)
	{
		int[] elems = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			elems[i] = arr[i];
		}
		arr[0] = elems[elems.length-1];
		for(int i = 0; i < elems.length-1; i++)
		{
			arr[i+1] = elems[i];
		}
	}
	/*int sumCount(int) - функция для суммирования цифр в числе*/
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
/* функцию по имени maxSumDigits, которая получает массив
целых положительных чисел и возвращает то число из массива у которого
наибольшая сумма цифр.
int maxSumDigits(int[ ])
*/
	public static int maxSumDigits(int[] arr)
	{
		int[] temp = new int[arr.length];
		for(int i = 0; i < temp.length; i++)
		{
			temp[i] = sumCount(arr[i]);
		}
		int max = temp[0];
		for(int i = 0; i < temp.length; i++)
		{
			if (max < temp[i])
				max = arr[i];
		}
		return max;			
	}
	/*boolean isEven(int)  - функция проверяет число на четность всех его числе, возвращает true - если все цифры числа четные*/
	public static boolean isEven(int number)
	{
		while (number > 0)
		{
			if((number%10)%2 == 0)
			{
				number = number/10;
			}
			else 
				return false;
		}
		return true;
	}
	/*boolean isOdd(int)  - функция проверяет число на нечетность всех его числе, возвращает true - если все цифры числа нечетные*/
	public static boolean isOdd(int number)
	{
		while (number > 0)
		{
			if((number%10)%2 == 1)
			{
				number = number/10;
			}
			else 
				return false;
		}
		return true;
	}
	/* countEvenOdd, которая получает массив
целых положительных чисел и возвращает количество чисел у которых есть четные и
нечетные цифры.
int countEvenOdd(int[ ])*/
	public static int countEvenOdd(int[] arr)
	{
		int count = 0;
		for(int i: arr)
		{
			if(!isOdd(i) && !isEven(i))
			{
				count++;
			}
		}
		return count;
	}
	/*sortEvenOdd, которая получает массив
целых чисел и упорядочивает числа так, чтобы нечетные числа были с начала а
четные в конце.
void sortEvenOdd(int[ ])*/
	/*public static void sortEvenOdd1(int[] arr)
	{
		for(int i: arr)
		{
			if(i%2 == 1)
				System.out.print(i + " ");
		}
		for(int i: arr)
		{
			if(i%2 == 0)
				System.out.print(i + " ");
		}
	}*/
	
	public static void sortEvenOdd(int[] arr)
	{
		int[] elems = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			elems[i] = arr[i];
		}
		int j = 0;
		for(int i: elems)
		{
			if(i%2 == 1)
			{
				arr[j] = i;
				j++;
			}
		}
		int k = j;
		for(int i: elems)
		{
			if(i%2 == 0)
			{
				arr[k] = i;
				k++;
			}
		}
	}
	/* threeDates, которая получает массив
календарных чисел ищет и возвращает то календарное число, для которого в
массиве есть еще два календарных числа составляющиее серию из трех
последовательных календарных чисел. Если такого календарного числа в массиве нет
функция возвращает текущее календарное число.
MyDate threeDates(MyDate[ ] )
*/
	public static MyDate threeDates(MyDate[] dates)
	{
		MyDate tmp = new MyDate();
		int[] count = new int[dates.length];
		for(int i = 0; i <  dates.length; i++)
		{
			int counts = 0;
			for(int j = 0; j < dates.length; j++)
			{
				if((dates[i].nextDate().equals(dates[j]) || dates[i].nextDate().nextDate().equals(dates[j])) && i!=j )
				{
					counts++;
					count[i] = counts;
				}
			}
		}
		for(int i = 0; i < count.length; i++)
		{
			if(count[i] == 2) {
				tmp = dates[i];
				break;
			}
		}
		return tmp;
	}
}
