public class Exam extends Mark implements IExam{
	
	public double getExMark() {
		return super.getGrade();
	}

	public void setExMark(double m) {
		super.setGrade(m);	
	}

	public void printExMark() {
		System.out.println("Exam mark " + getExMark());		
	}

	public Exam() {
		
	}
	
	
}
