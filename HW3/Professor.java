//Hlazkova Alina 346316979
public class Professor extends Person implements IHours, ITeacher{
	private BaseProfessor professor;
	
	public Professor(String name, int hours, String course_list) {
		super(name);
		professor = new BaseProfessor(hours, course_list);
	}
	
	@Override
	public int getTeachHours() {
		return professor.getHours();
	}

	@Override
	public String[] getTeachCourse_list() {
		return professor.getCourse_list();
	}

	@Override
	public void print() {
		super.print();
		professor.print();
	}

	@Override
	public int getAllHours() {
		return getTeachHours();
	}

}
