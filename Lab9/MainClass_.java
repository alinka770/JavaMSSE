public class MainClass_ {
	
	public static void main(String[] args) {
		HomeWorksExam hwe1 = new HomeWorksExam("Polina", 100, 100);
		HomeWorksExam hwe2 = new HomeWorksExam("Vasiliy", 75, 90);
		
		ProjectExam pe1 = new ProjectExam("Galina", 60, 99);
		ProjectExam pe2 = new ProjectExam("Alex", 90, 78);
		
		hwe1.print();
		System.out.println("********************************************");
		hwe2.print();
		System.out.println("********************************************");
		pe1.print();
		System.out.println("********************************************");
		pe2.print();
		System.out.println("********************************************");
		
		HomeWorksExam best1;
		ProjectExam best2;
		Student_ best;
		
		if(hwe1.finalMark() > hwe2.finalMark())
			best1 = hwe1;
		else
			best1 = hwe2;
		if(pe1.finalMark() > pe2.finalMark())
			best2 = pe1;
		else
			best2 = pe2;
		if(best1.finalMark() > best2.finalMark())
			best = best1;
		else 
			best = best2;

		System.out.println("The best student");
		best.printName();
		
		
	}

}
