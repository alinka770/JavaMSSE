//Hlazkova Alina 346316979
public class WorkerInstructor extends Person implements ITeacher, IHours{
	
	BaseWorker worker;
	BaseInstructor instructor;
	
	public WorkerInstructor(String name, int hours, String position, int hoursI, String course_list) {
		super(name);
		worker = new BaseWorker(hours, position);
		instructor = new BaseInstructor(hoursI, course_list);
	}

	@Override
	public int getAllHours() {
		return worker.getHours() + instructor.getHours();
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
	public void print()
	{
		super.print();
		worker.print();
		instructor.print();
	}

}
