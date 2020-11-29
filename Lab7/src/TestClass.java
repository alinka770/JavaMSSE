public class TestClass {

	public static void main(String[] args) {
		
		Student [] students = {new Student("Alina"), new Student("Alla"), new Student("Vasya")};
		Mark m1 = new Mark("Algebra", 100);
		Mark m2 = new Mark("Data base", 95);
		
		students[0].addMarkObject(m1);
		students[0].addMarkObject(m2);
		students[0].print();
		
		students[1].addMark("JAVA", 75);
		students[1].addMark("Data base", 85);
		students[1].addMark("Algebra", 51);
		students[1].print();
		
		students[2].addMark("C#", 99);
		students[2].addMark("JAVA", 78);
		students[2].addMark("Data base", 50);
		students[2].print();
		students[2].addMark("Data base", 69);
		students[2].addMark("Algebra", 100);
		students[2].print();
		
		System.out.println("*********************************************************");
		System.out.println("Show students with a subject Algebra whith passing mark");
		System.out.println("*********************************************************");
		for(Student s: students)
		{
			s.printPass("Algebra");
		}
		
		Student min = students[0];
		System.out.println("*********************************************************");
		System.out.println("Student with a minimal average grade: ");
		System.out.println("*********************************************************");
		for(int i = 0; i < students.length-1; i++)
		{
			min = students[i].compareStudents(students[i+1]);
		}
		min.print();
	}

}
