//Hlazkova Alina 346316979
public class Instructor extends Person implements IHours, ITeacher {
		
	private BaseInstructor instructor;
	
	public Instructor(String name, int hours, String course_list) {
		super(name);
		instructor = new BaseInstructor(hours, course_list);
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
	public void print() {
		super.print();
		instructor.print();
	}

	@Override
	public int getAllHours() {
		return getTeachHours();
	}

}
