//Hlazkova Alina 346316979
public class MainClasss {
	/*метод по имени maxTemp в классе MainClass, который
получает массив замеров температур(Location[ ]) и возвращает индекс
географического места с максимальной средней температурой.
int maxTemp(Location[ ])*/
	public static int maxTemp(Location[] loc)
	{
		double[] av = new double[loc.length];
		int max = 0;
		if(loc!=null)
		{
			for(int l = 0; l < loc.length; l++)
			{
				av[l] = loc[l].average();
			}
			double averageMax = av[0];
			for(int i = 1; i < loc.length; i++)
			{
				if(av[i] > averageMax)
					{
						averageMax = av[i];
						max = i;
					}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		/*int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15};
		int[] arr2 = {1, 2, 3, 4, 5};
		int[] arr3 = {81, 122, 3898, 15153, 5967, 264, 798};
		int[] arr4 = {798, 81, 122, 3898, 15153, 5967, 264};
		MyDate arr5[]= {new MyDate(1,11,2020),new MyDate(2,12,2020),new MyDate(12,8,2020),
				 new MyDate(4,12,2020),new MyDate(3,12,2020),new MyDate(14,12,2020)};
		Temperature temp = new Temperature(-66);
		Temperature temp2 = new Temperature(temp);
		
		Utility.printArray(arr);
		System.out.println("\n*****************************************************");
		Utility.shiftRight(arr);
		System.out.println("\n------------------------------------------------------");
		Utility.shiftRight(arr2);
		System.out.println("\n*****************************************************");
		System.out.println(Utility.maxSumDigits(arr3));
		System.out.println("\n*****************************************************");
		System.out.println(Utility.countEvenOdd(arr3));
		System.out.println("\n*****************************************************");
		Utility.sortEvenOdd(arr4);
		System.out.println("\n*****************************************************");
		Utility.threeDates(arr5).printDate();
		
		temp.printTempFull();
		temp2.printTempFull();*/
		
		
		int[ ] arr1={81,122,3898,15153,5967,264,798};
		//Utility.printArray(arr1);
		System.out.println("#Q1");
		Utility.shiftRight(arr1);
		Utility.printArray(arr1);//798 81 122 3898 15153 5967 264 
		System.out.println();
		System.out.println("#Q2");
		System.out.println("Max sum digits number is: "+Utility.maxSumDigits(arr1));//Max sum digits number is: 3898
		System.out.println("#Q3");
		System.out.println("Count even and odd digits number is: "+Utility.countEvenOdd(arr1));//Count even and odd digits number is: 5
		System.out.println("#Q4");
//		Utility.sortEvenOdd1(arr1);//81 15153 5967 798 122 3898 264 
		Utility.sortEvenOdd(arr1);//81 15153 5967 798 122 3898 264 
		Utility.printArray(arr1);
		System.out.println("\n#Q5");
		MyDate arr2[]= {new MyDate(1,11,2020),new MyDate(2,12,2020),new MyDate(12,8,2020), new MyDate(4,12,2020),new MyDate(3,12,2020),new MyDate(14,12,2020)};
		Utility.threeDates(arr2).printDate();
		System.out.println();
		System.out.println("#Q6");
		Location[] arr3= {new Location("Tel-Aviv"), new Location("London"), new Location("Paris"), new Location("Berlin")};
		arr3[0].addTemp(12);
		arr3[0].addTemp(14,1,12,2020);
		arr3[0].addTemp(21,28,11,2020);
		arr3[0].addTemp(30,12,9,2020);
		arr3[1].addTemp(25,28,8,2020);
		arr3[1].addTemp(10);
		arr3[1].addTemp(14,10,10,2020);
		arr3[1].addTemp(17,9,11,2020);
		arr3[1].addTemp(14,28,11,2020);
		arr3[1].addTemp(11,2,12,2020);
		arr3[2].addTemp(27,4,7,2020);
		arr3[2].addTemp(25,2,8,2020);
		System.out.println("Number of locations is: " + Location.getCount());
		for (Location x: arr3)
			x.printLocation();
		System.out.println("Max aveare temp of: ");
		arr3[maxTemp(arr3)].printLocation();
		System.out.println("average temperature is:"+(int)arr3[maxTemp(arr3)].average()+(char)176+"C");
		System.out.print("max temperature of "+ arr3[1].getName()+": ");
		arr3[1].max().printTempFull();
		System.out.println("\ntemperatures close to average: "+(int)arr3[1].average()+(char)176+"C");
		arr3[1].printLocation(2);
//		System.out.println("\nFunction three dates: ");
//		MyDate arr4[]= {new MyDate(1,12,2020),new MyDate(2,12,2020),new MyDate(12,8,2020), new MyDate(4,12,2020),new MyDate(3,12,2020),new MyDate(14,12,2020)};
//		Utility.threeDates(arr4).printDate();
	}

}
