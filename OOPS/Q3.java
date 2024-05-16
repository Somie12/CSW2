import java.util.*;
public class Q3 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = sc.nextDouble();
        System.out.println("Enter y: ");
        double y = sc.nextDouble();
        Point p = new Point(x,y);
        Point p2 = new Point(p);

        System.out.println("Point 1: (" + p.getX() + ", " + p.getY() + ")");
        System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");

        System.out.println("Enter new x: ");
        double x2 = sc.nextDouble();
        p2.setX(x2);

        System.out.println("Point 1: (" + p.getX() + ", " + p.getY() + ")");
        System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}

class Point
{
    double x,y;
    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    Point(Point a)
    {
        this.x = a.x;
        this.y = a.y;
    }

    double getX()
    {
        return x;
    }

    double getY()
    {
        return y;
    }

    void setX(double x)
    {
        this.x = x;
    }

    void setY(double y)
    {
        this.y = y;
    }
}
