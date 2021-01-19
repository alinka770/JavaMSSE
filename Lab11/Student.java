public class Student extends Person{

	private double gpa;
	
	public Student(String name, int age, double gpa)
	{
		super(name, age);
		try
		{
			setGpa(gpa);
		}
		catch(GradeException ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) throws GradeException{
		if(gpa < 0)
		{
			this.gpa = 0;
			throw new GradeException();
		}
		if(gpa > 100)
		{
			this.gpa = 100;
			throw new GradeException();
		}
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
