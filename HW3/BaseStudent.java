//Hlazkova Alina 346316979
public class BaseStudent implements IPerson, ICourse{
	
	private int hours;
	private String[] course_list;
	
	public BaseStudent(int hours, String course_list)
	{
		setHours(hours);
		setCourse_list(course_list.split(" "));
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String[] getCourse_list() {
		return course_list;
	}

	public void setCourse_list(String[] course_list) {
		this.course_list = course_list;
	}

	@Override
	public void printCourseList() {
			for(String c: course_list)
			{
				System.out.print(c + "; ");
			}	
		}
	

	@Override
	public void print() {
		System.out.println("student");
		System.out.print("Courses: ");
		printCourseList();
		System.out.println();	
		System.out.println("Study hours: " + hours);
	}
	
}
