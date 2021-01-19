public class Circle extends Shape{
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Circle(int x, int y, double radius)
	{
		super(x, y);
		setRadius(radius);
	}
	
	@Override
	public double getArea()
	{
		return Math.PI * radius * radius;
	}

	public void print()
	{
		System.out.println("This is circle with radius " + radius + " and center in");
		super.print();	
	}
}
