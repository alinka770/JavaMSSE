public class Professor extends Person {
	
	private int numOfPubs;
	
	public Professor(String name, int age, int numOfPubs)
	{
		super(name, age);
		this.numOfPubs = numOfPubs;
	}
	
	public void print()
	{
		super.print();
		System.out.println(" number of pubs " + numOfPubs);
	}
	
	public boolean isOutStanding()
	{
		if(numOfPubs > 100)
			return true;
		else return false;
	}

}
