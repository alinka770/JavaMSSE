public class Mark {
	private String course;
	private int grade;
	
	public Mark() {
		course = "";
		grade = 0;
	}
	
	public Mark(String course, int grade)
	{
		setCourse(course);
		setGrade(grade);
	}

	public int getGrade()
	{
		return grade;
	}
	
	public void setGrade(int grade)
	{
		if((grade >= 0 && grade <= 100) || grade == 199)
			this.grade = grade;
		else if(grade < 0)
			this.grade = 0;
		else if(grade > 100 && grade != 199)
			this.grade = 100;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public void setCourse(String course)
	{
		this.course = course;
	}
	
	public void printMark()
	{
		System.out.println("Name of course : " + course + "; Grade: " + grade);
	}
	
	public boolean passingGrade()
	{
		if((grade >= 56 && grade <= 100) || grade == 199)
			return true;
		else return false;
	}
}
