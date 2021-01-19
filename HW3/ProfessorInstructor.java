//Hlazkova Alina 346316979
public class ProfessorInstructor extends Person implements IHours, ITeacher{
	
	BaseProfessor professor;
	BaseInstructor instructor;
	
	public ProfessorInstructor(String name, int hours, String courseList, int hoursI, String course_list) {
		super(name);
		professor = new BaseProfessor(hours, courseList);
		instructor = new BaseInstructor(hoursI, course_list);
	}

	@Override
	public void print() {
		super.print();
		professor.print();
		instructor.print();	
	}

	@Override
	public int getAllHours() {
		return professor.getHours() + instructor.getHours();
	}

	@Override
	public int getTeachHours() {
		return getAllHours();
	}

	@Override
	public String[] getTeachCourse_list() {
		String[] instList = instructor.getCourse_list();
		String[] profList = professor.getCourse_list();
		int iter = instList.length;
		String[] result = new String[instList.length + profList.length];
		for(int r = 0; r < instList.length; r++)
			result[r] = instList[r];
		for(int r = 0; r < profList.length; r++)
			result[iter] = profList[r];
		return result;
	}

}
