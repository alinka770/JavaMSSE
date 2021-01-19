public class Project extends Mark implements IProject{

	public double getPrMark() {
		return super.getGrade();
	}

	public void setPrMark(double m) {
		super.setGrade(m);	
	}

	public void printPrMark() {
		System.out.println("Project mark " + getPrMark());
	}
	
	public Project() {
		
	}


}
