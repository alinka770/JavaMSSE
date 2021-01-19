public class Professor extends Person implements Icollege {
	
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
		if(numOfPubs > excellent_publication)
			return true;
		else return false;
	}

}