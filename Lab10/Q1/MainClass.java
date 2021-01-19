public class MainClass {
	
	public static void printPersons(Person[] persons)
	{
		for(Person p: persons)
			p.print();
	}
	
	public static void printStudentProfessor(Person[] persons)
	{
		System.out.println("Printing students: ");
		for(Person p: persons)
		{
			if(p instanceof Student)
				p.print();
		}
		
		System.out.println("Printing professors: ");
		for(Person p:persons)
		{
			if(p instanceof Professor)
				p.print();
		}
	}
	
	public static void printStudentProfessors2(Person[] persons)
	{
		System.out.println("Printing students and professors: ");
		for(Person p: persons)
		{
			if(p instanceof Professor || p instanceof Student)
				p.print();	
		}
			
	}
	
	public static void printStudents(Person[] persons)
	{
		int count = 0;
		for(Person p: persons)
		{
			if(p instanceof Student)
			{
				if(((Student)p).getGpa() < 60) {
					p.print();
					count++;
				}
			}
		}
		System.out.println("Count of studens that have gpa less than 100 is " + count);
	}
		
	public static void printProfessors(Person[] persons)
	{
		int pubs = 0;
		for(Person p: persons)
		{
			if(p instanceof Professor)
			{
				if(((Professor)p).getNumOfPubs() > pubs)
					pubs = ((Professor) p).getNumOfPubs();
			}
		}
		for(Person p: persons)
		{
			if(p instanceof Professor)
			{
				if(((Professor)p).getNumOfPubs() == pubs)
					System.out.println(p.getAge());
			}
		}

	}
	
	public static void sortAge(Person[] persons)
	{
		for(int i = 1; i < persons.length; i++)
		{
			Person cur = persons[i];
			int j = i - 1;
			while(j >= 0 && cur.getAge() > persons[j].getAge())
			{
				persons[j+1] = persons[j];
				j--;
			}
			persons[j+1] = cur;
		}
	}
	
	public static void getExcellentPersons(Person[] persons)
	{
		System.out.println("Student with excellent gpa: ");
		for(Person p: persons)
		{
			if(p.isOutStanding() && p instanceof Student)
				p.print();
		}
		System.out.println("Professors with number of pubs > 100");
		for(Person p: persons)
		{
			if(p.isOutStanding() && p instanceof Professor)
				p.print();
		}
	}
	
	public static void getExcellentPersonsAll(Person[] persons)
	{
		System.out.println("Outstanding persons: ");
		for(Person p: persons)
		{
			if(p.isOutStanding())
				p.print();
		}	
	}
	
	public static void printGpaStudents(Person[] persons)
	{
		for(Person p: persons)
		{
			if(p instanceof Student)
				System.out.println(p.getName() + " " + ((Student)p).getGpa());
		}
	}
	
	public static void printMinimalAgeProfWithOutStanding(Person[] persons)
	{
		int minimal = persons[0].getAge();
		for(Person p: persons)
		{
			if(p.isOutStanding() && p instanceof Professor && p.getAge() < minimal)
				minimal = p.getAge();
		}
		System.out.println("The minimal age of professor that has number of pubs > 100 is " + minimal);
	}
		
	public static void main(String[] args) {
		
		Person[] persons = {new Student("Alina", 21, 100), new Student("Kate", 35, 75), new Professor("Alise", 66, 150), new Professor("Evgen", 34, 50), new Professor("Shlomo", 40, 35),
				new Student("Roman", 25, 59), new Student("Elizaveta", 28, 65), new Professor("Ivan", 45, 150), new Professor("Shimon", 55, 55), new Student("Karen", 30, 56)};
		
		printStudents(persons); //Roman 25 59.0    
								//Karen 30 56.0
		System.out.println("****************************************");
		System.out.println("The age of professors that have a maximum number of publications is: ");
		printProfessors(persons);
		System.out.println("****************************************");
		System.out.println("Sort persons in descending age: ");
		sortAge(persons);
		printPersons(persons);
		System.out.println("****************************************");
		System.out.println("variant 1");
		System.out.println();
		printStudentProfessor(persons);
		System.out.println();
		System.out.println("variant 2");
		System.out.println();
		printStudentProfessors2(persons);
		System.out.println("****************************************");
		System.out.println("Variant 1");
		System.out.println();
		getExcellentPersons(persons);
		System.out.println();
		System.out.println("Variant 2");
		System.out.println();
		getExcellentPersonsAll(persons);
		System.out.println("****************************************");
		printGpaStudents(persons);
		System.out.println("****************************************");
		printMinimalAgeProfWithOutStanding(persons);

		
	}

}
