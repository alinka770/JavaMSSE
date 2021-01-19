public class Student_ {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student_(String name)
	{
		setName(name);
	}
	
	public void printName()
	{
		System.out.println("Name: " + this.name);
	}
}
