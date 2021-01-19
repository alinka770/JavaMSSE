public class Square extends Shape {
	double length;
	
	public Square(int x, int y, double length) {
		super(x, y);
		setLength(length);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return length * length;
	}
	
	public void print()
	{
		System.out.println("This is square with length " + length + " and top left point");
		super.print();	
	}

}
