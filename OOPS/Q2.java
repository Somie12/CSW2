import java.util.*;
public class Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        Rectangle obj = new Rectangle(length, width);
        System.out.println("Area: " + obj.getArea());
        System.out.println("Perimeter: " + obj.getPerimeter());
        System.out.println("Enter new length: ");
        length = sc.nextDouble();
        System.out.println("Enter new width: ");
        width = sc.nextDouble();
        Rectangle ob2 = new Rectangle(0.0,0.0);
        ob2.setLength(length);
        ob2.setWidth(width);
        System.out.println("Area: " + ob2.getArea());
        System.out.println("Perimeter: " + ob2.getPerimeter());

    }
    
}

class Rectangle
{
    private double length;
    private double width;

    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    double getLength()
    {
        return length;
    }

    double getWidth()
    {

        return width;
    }

    void setLength(double length)
    {
        this.length = length;
    }

    void setWidth(double width)
    {

        this.width = width;
    }

    void display()
    {
       
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    double getArea()
    {
        return length * width;
    }

    double getPerimeter()
    {

        return 2 * (length + width);
    }
}
