public class ProjectExam extends Student_ implements Ifmark, IProject, IExam {
	
	Project pr = new Project();
	Exam ex = new Exam(); 

	public ProjectExam(String name, double  exMark, double prMark) {
		super(name);
		setExMark(exMark);
		setPrMark(prMark);
	}
	
	public double finalMark()
	{
		return 0.5 * getExMark() + 0.5 * getPrMark();
	}
	
	public void print()
	{
		super.printName();
		printPrMark();
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

	public double getPrMark() {
		return pr.getPrMark();
	}

	public void setPrMark(double m) {
		pr.setPrMark(m);
	}

	public void printPrMark() {
		pr.printPrMark();
	}
}
