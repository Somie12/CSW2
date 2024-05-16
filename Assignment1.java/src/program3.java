class point{
private int X;
private int Y;
public point(int X,int Y)
{
	this.X=X;
	this.Y=Y;
	
}
public point(point another)
{
	this(another.X,another.Y);
}
public int get_X() {
	return X;
}
public int get_Y() {
	return Y;
}
public void set_X(int X) {
	this.X=X;
}
public void set_Y(int Y)
{
	this.Y=Y;
}


}
public class program3 {
public static void main(String[]args)
{
	point p1=new point(4,5);
	point p2=new point (p1);
	System.out.println("X"+" "+p1.get_X()+" "+"Y "+" "+p1.get_Y());
	p1.set_X(6);
	p1.set_Y(9);
	System.out.println("X"+" "+p1.get_X()+" "+"Y "+" "+p1.get_Y());
}
}
