public class Student {
	private static int idH = 0;
	private int id;
	private String name;
	private Mark[] marks;
	
	public Student(String name)
	{
		setName(name);
		id = ++idH;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void print()
	{
		System.out.println("Name of student: " + name);
		for(Mark m: marks)
			m.printMark();
	}
	
	public void printPass(String course)
	{
		if(marks!=null)
		{
			for(Mark m: marks)
			{
				if(m.passingGrade() && m.getCourse() == course)
				{
					System.out.println("Name of student: " + name);
					m.printMark();		
				}
			}
		}
	}
	
	public boolean ifExistsStudent(String course)
	{
		if(marks == null)
			return false;
		for(Mark m: marks)
		{
			if(m==null)
				return false;
			if(m.getCourse() == course)
				return true;
		}
		return false;
	}
	
	public void addMark(String course, int mark)
	{
		if(marks == null)
		{
			marks = new Mark[1];
		}
		else
		{
			if(ifExistsStudent(course) == false)
			{
				Mark[] tmp = new Mark[marks.length + 1];
				for(int i = 0; i < marks.length; i++)
					tmp[i] = marks[i];
				marks = tmp;
			}
		}
		if(ifExistsStudent(course) == true)
		{
			for(Mark m: marks)
			{
				if(m!=null)
				{
					if(m.getCourse() == course)
						m.setGrade(mark);
				}
			}
		}
		else
		{
			marks[marks.length - 1] = new Mark(course, mark);
		}
	}
	
	public void addMarkObject(Mark mark)
	{
		if(marks == null)
		{
			marks = new Mark[1];
		}
		else
		{
			if(ifExistsStudent(mark.getCourse()) == false)
			{
				Mark[] tmp = new Mark[marks.length + 1];
				for(int i = 0; i < marks.length; i++)
					tmp[i] = marks[i];
				marks = tmp;
			}
		}
		if(ifExistsStudent(mark.getCourse()) == true)
		{
			for(Mark m: marks)
			{
				if(m.getCourse().equals(mark.getCourse()))
				{
					m.setGrade(mark.getGrade());
				}
			}
		}
		else
			marks[marks.length - 1] = mark;
	}
	
	public int getMark(String name)
	{
		int grade = 0; 
		if(ifExistsStudent(name))
		{
			for(Mark m: marks)
			{
				if(m.getCourse() == name)
					grade = m.getGrade();
			}
		}
		else
			System.out.println("This student have not got a subject " + name);
		return grade;
	}
	
	public double getAverage()
	{
		int sum = 0;
		int len = marks.length;
		for(Mark m: marks)
		{
			sum += m.getGrade();
		}
		return (double)sum/len;
	}
	
	public Student compareStudents(Student student)
	{
		double avg1 = this.getAverage();
		double avg2 = student.getAverage();
		if(avg1 < avg2)
			return this;
		else
			return student;	
	}

}
