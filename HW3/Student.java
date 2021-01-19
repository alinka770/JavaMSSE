//Hlazkova Alina 346316979
public class Student extends Person implements IHours, IStudent{
	
	private BaseStudent student;
	
	public Student(String name, int hours, String course_list) {
		super(name);
		student = new BaseStudent(hours, course_list);
	}
	
	@Override
	public void print() {
		super.print();
		student.print();
	}

	@Override
	public int getAllHours() {
		return getStudentHours();
	}

	@Override
	public int getStudentHours() {
		return student.getHours();
	}

	@Override
	public String[] getStudentCourse_list() {
		return student.getCourse_list();
	}
	
}
