public class MainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student("Alina", 21, 99.9);
		Student s2 = new Student("Vasya", 25, 65);
		
		Professor p1 = new Professor("Kate", 66, 101);
		Professor p2 = new Professor("Maxim", 35, 35);
		
		if(s1.isOutStanding())
			s1.print();
		if(s2.isOutStanding())
			s2.print();
		if(p1.isOutStanding())
			p1.print();
		if(p2.isOutStanding())
			p2.print();
		
		Person young;
		Person youngStudent;
		Person youngProfessor;
		if(s1.compare(s2))
			youngProfessor = s1;
		else
			youngProfessor = s2;
		if(p1.compare(p2))
			youngStudent = p1;
		else
			youngStudent = p2;
		if(youngProfessor.compare(youngStudent))
			young = youngProfessor;
		else
			young = youngStudent;
		System.out.print("The youngest person: " );
		young.print();
		
		System.out.println("Before: ");
		s1.print();
		Person newStudent = s1;
		System.out.println("After: ");
		newStudent.print();
	}

}
