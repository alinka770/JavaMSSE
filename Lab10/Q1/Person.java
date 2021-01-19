public abstract class Person {
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		setAge(age);
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)
	{
		if(age >= 0)
			this.age = age;
		else
			this.age = Math.abs(age);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void print()
	{
		System.out.print(name + " " + age + " ");
	}
	
	public boolean compare(Person p)
	{
		if(this.age < p.age)
			return true;
		else return false;
	}
	
	public abstract boolean isOutStanding();
}
