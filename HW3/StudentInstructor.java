//Hlazkova Alina 346316979
public class StudentInstructor extends Person implements ITeacher, IHours, IStudent{
	BaseStudent student;
	BaseInstructor instructor;
	
	public StudentInstructor(String name, int hours, String courseList, int hoursI, String course_list) {
		super(name);
		student = new BaseStudent(hours, courseList);
		instructor = new BaseInstructor(hoursI, course_list);
	}
	
	@Override
	public void print() {
		super.print();
		instructor.print();	
		student.print();
	}

	@Override
	public int getAllHours() {
		return student.getHours() + instructor.getHours();
	}

	@Override
	public int getTeachHours() {
		return instructor.getHours();
	}

	@Override
	public String[] getTeachCourse_list() {
		return instructor.getCourse_list();
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
