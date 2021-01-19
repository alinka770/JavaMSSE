public class MainClass {
	
	public static void getMaximumArea(Shape[] shapes)
	{
		System.out.println("The shape with a maximum area: ");
		double maxArea = 0;
		Shape shapeWithMaxArea = shapes[0];
		for(Shape s: shapes)
		{
			if(s.getArea() > maxArea)
			{
				maxArea = s.getArea();
				shapeWithMaxArea = s;
			}
		}
		shapeWithMaxArea.print();
	}
	
	public static void printShape(Shape[] shapes)
	{
		for(Shape s: shapes)
			s.print();
	}
	
	public static void printFiguresWithSimilarArea(Shape[] shapes)
	{
		System.out.println("Figures with a similar areas: ");
		double minimal = Math.abs(shapes[0].getArea() - shapes[1].getArea());
		Shape[] twoShapes = new Shape[2];
		for(int i = 0; i < shapes.length; i++)
		{
			for(int j = i + 1; j < shapes.length; j++)
			{
				if(Math.abs(shapes[i].getArea() - shapes[j].getArea()) < minimal)
				{
					minimal = Math.abs(shapes[i].getArea() - shapes[j].getArea());
					twoShapes[0] = shapes[i];
					twoShapes[1] = shapes[j];
				}
			}
		}
		printShape(twoShapes);
	}

	public static void printCountShape(Shape[] shapes)
	{
		int countCircle = 0;
		int countSquare = 0;
		for(Shape s: shapes)
		{
			if(s instanceof Circle)
				countCircle++;
			else
				countSquare++;
		}
		System.out.println("Count of circles is " + countCircle + " and count of squares is " + countSquare);
	}
	
	public static void main(String[] args) {

		Shape[] shapes = {new Circle(0, 0, 5), new Circle(1, 1, 6), new Circle(2, 2, 7), new Square(3, 3, 8), new Square(4, 4, 9), new Square(5, 5, 10),
				new Circle(6, 6, 11), new Circle(7, 7, 12), new Square(8, 8, 13), new Square(9, 9, 14)};
		
		getMaximumArea(shapes);
		System.out.println("***************************************");
		printFiguresWithSimilarArea(shapes);
		System.out.println("***************************************");
		printCountShape(shapes);		
	}

}
