class Rectangle
{
	private double length;
	private double breadth;
	Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double get_length() {
		return length;
	}
	public double get_breadth() {
		return breadth;
	}
	public void set_length(double length)
	{
		this.length=length;
	}
	public void set_breadth(double breadth) {
		this.breadth=breadth;
	}
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
}
public class program2 {
public static void main(String[]args)
{
	Rectangle rectangle=new Rectangle(4,2);
	rectangle.set_length(2);
	rectangle.set_breadth(2);
	System.out.println("The perimeter of rectangle"+rectangle.perimeter());
	System.out.println("The area of rectangle"+rectangle.area());
}
}
