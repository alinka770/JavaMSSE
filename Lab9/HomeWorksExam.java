public class HomeWorksExam extends Student_ implements Ifmark, IHomeWorks, IExam 
{
	
	Exam ex = new Exam();
	HomeWorks hws = new HomeWorks();
	
	public HomeWorksExam(String name, double markHw, double markEx) {
		super(name);
		setHwMark(markHw);
		setExMark(markEx);		
	}

	public double finalMark()
	{
		return 0.8 * getExMark() + 0.2 * getHwMark();
	}
	
	public void print()
	{
		super.printName();
		printHwMark();
		printExMark();
		System.out.println("Final mark " + finalMark());
	}

	public double getExMark() {
		return ex.getExMark();
	}

	public void setExMark(double m) {
		ex.setExMark(m);		
	}

	public void printExMark() {
		ex.printExMark();
	}

	public double getHwMark() {
		return hws.getHwMark();
	}

	public void setHwMark(double m) {
		hws.setHwMark(m);	
	}

	public void printHwMark() {
		hws.printHwMark();		
	}
}
