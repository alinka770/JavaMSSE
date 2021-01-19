public class MainClass {

	public static void main(String[] args) {

		Student s1 = new Student("Alina", 21, 99.9);
		Student s2 = new Student("Vasya", 19, 65);
		
		Professor p1 = new Professor("Kate", 66, 88);
		Professor p2 = new Professor("Maxim", 35, 35);
		
		int countSt = 0;
		int countPr = 0;
		
		if(s1.isOutStanding())
		{
			s1.print();
			countSt++;
		}
		if(s2.isOutStanding())
		{
			s2.print();
			countSt++;
		}
		if(!p1.isOutStanding())
			p1.print();
		else
			countPr++;
		if(!p2.isOutStanding())
			p2.print();
		else
			countPr++;
		
		Person young = null;
		Person youngStudent = null;
		Person youngProfessor = null;
		
		if(s1.isOutStanding()&&s2.isOutStanding()&&s1.compare(s2))
			youngStudent = s1;
		else if(s1.isOutStanding()&&s2.isOutStanding()&&!s1.compare(s2))
			youngStudent = s2;
		else if(!s1.isOutStanding()&&s2.isOutStanding())
			youngStudent = s2;
		else if(!s1.isOutStanding()&&!s2.isOutStanding())
			System.out.println("This is not students whith excellent marks");
		else
			youngStudent = s1;
		
		if(p1.isOutStanding()&&p2.isOutStanding()&&p1.compare(p2))
			youngProfessor = p1;
		else if(p1.isOutStanding()&&p2.isOutStanding()&&!p1.compare(p2))
			youngProfessor = p2;
		else if(!p1.isOutStanding()&&p2.isOutStanding())
			youngProfessor = p2;
		else if(!p1.isOutStanding()&&!p2.isOutStanding())
			System.out.println("This is not professors with pabs >= 100");
		else
			youngProfessor = p1;
		
		if(youngProfessor!=null && youngStudent!=null&&youngProfessor.compare(youngStudent))		
				young = youngProfessor;
		else if(youngProfessor!=null && youngStudent!=null&&!youngProfessor.compare(youngStudent))	
				young = youngStudent;
		else if(youngProfessor == null && youngStudent!=null)
			young = youngStudent;
		else if(youngProfessor!=null && youngStudent==null)
			young = youngProfessor;
		else
			System.out.println("There is no people with isOutStanding crytheries");

		
		if(young!=null)
		{
			System.out.print("The youngest person: " );
			young.print();
		}
		
		System.out.println("There is " + countSt + " students with outstanding criteria and " + countPr + " professors with outstanding criteria.");
		
		
	}

}
