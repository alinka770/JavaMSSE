//Hlazkova Alina 346316979
public abstract class Person implements IPerson{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}		
	
	public Person(String name)
	{
		setName(name);
	}
	
	public void print()
	{
		System.out.println("Name: " + this.name);
	}
}
