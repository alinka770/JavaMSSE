public class Student extends Person implements Icollege{

	private double gpa;
	
	public Student(String name, int age, double gpa)
	{
		super(name, age);
		this.gpa = gpa;
	}
	
	public void print()
	{
		super.print();
		System.out.print(gpa + "\n");
	}
	
	public boolean isOutStanding()
	{
		if(gpa > excellent_mark)
			return true;
		else
			return false;
	}
}
