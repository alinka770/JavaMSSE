public class Student extends Person{

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
		if(gpa > 85)
			return true;
		else
			return false;
	}
}
