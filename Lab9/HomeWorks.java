public class HomeWorks extends Mark implements IHomeWorks{
	public double getHwMark()
	{
		return super.getGrade();
	}
	
	public void setHwMark(double m)
	{
		super.setGrade(m);
	}
	
	public void printHwMark()
	{
		System.out.println("Homework mark " + getHwMark());
	}
	
	public HomeWorks()
	{
		
	}

}
