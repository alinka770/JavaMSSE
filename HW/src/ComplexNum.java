//Hlazkova Alina teudat 346316979
public class ComplexNum {
	
	private double real, image;
	//Дефолтный конструктор, который определяет значение атрибутов 0
	public ComplexNum()
	{
		real = 0;
		image = 0;		
	}
	/*Конструктор, который получает два параметра, которые являются значениями
для атрибутов класса.*/
	public ComplexNum(double r, double i)
	{
		real = r;
		image = i;
	}
	/*Конструктор копирования, который получает объект ComplexNum и копирует
его значения.*/
	public ComplexNum(ComplexNum other)
	{
		real = other.real;
		image = other.image;
	}
	//метод Get для Real
	public double getReal()
	{
		return real;
	}
	//метод Get для Image
	public double getImage()
	{
		return image;
	}
	//метод Set для Iצשעק
	public void setImage(double i)
	{
		image = i;
	}
	//метод Set для Real
	
	public void setReal(double r)
	{
		real = r;
	}
	/*printComplex – печатает комплексное число ввиде a+bi.
*/
	
	public void printComplex()
	{
		System.out.println(strComplex());
	}
	/*strComplex – возвращает объект String ввиде комплексного числа a+bi.*/
	public String strComplex()
	{
		String str = "";
		if(real == 0 && image != 0)
			str = image + "i";
		else if(real != 0 && image == 0)
			str = real + " ";
		else if(image < 0)
			str = real + " - " + Math.abs(image) + "i";
		else if(real==0 && image ==0)
			str = real + "";
		else
			str = real + " + " + image + "i";
		return str;
			
	}
	/*addComplex - получает в виде параметра объект типа ComplexNum и
возвращает новое комплексное число(ComplexNum), которое является суммой
комплексных чисел(a=a1+a2, b=b1+b2).*/
	
	public ComplexNum addComplex(ComplexNum comp)
	{
		double a, b;
		a = real + comp.real;
		b = image + comp.image;
		return new ComplexNum(a, b);
	}
	
/*getAbsolute - который возвращает абсолютное значение комплексного числа*/
	
	public double getAbsolute()
	{
		return Math.sqrt(real*real + image*image);
	}
	
	/*equal - получает в виде параметра объект типа ComplexNum и возвращает
true если два комплексных числа равны, если нет возвращает false.
*/
	
	public boolean equal(ComplexNum comp)
	{
		if(real == comp.real && image == comp.image)
			return true;
		else return false;
	}
	
}
