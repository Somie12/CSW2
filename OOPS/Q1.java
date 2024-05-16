
import java.util.*;
class Car
{
    private String make;
    private String model;

    Car(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    String getMake()
    {
        return make;
    }

    String getModel()
    {
        return model;
    }

    void setMake(String make)
    {
        this.make = make;
    }
    void setModel(String model)
    {
        this.model = model;
    }
    void display() {
		System.out.println("Make: " + make + " Model:" + model);
	}
}

    class CarTester
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter make for car 1: ");
            String make = sc.next();
            System.out.println("Enter model for car 1: ");
            String model = sc.next();
            Car car1 = new Car(make, model);
            Car car2 = new Car(null, null);
            car1.display();
            System.out.println("For car 2: ");
            car2.display();
            System.out.println("Enter make for car 2: ");
            String make2 = sc.next();
            System.out.println("Enter model for car 2: ");
            String model2 = sc.next();
            car2.setMake(make2);
            car2.setModel(model2);
            System.out.println("Updated car2");
            car2.display();


        }
    }
public class Q1
{

}