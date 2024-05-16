package GenericsAndCollections.Part_1;

public class Q3 
{
    public static void main(String[] args) {
        Car car1 = new Car("Breeza", "White", 110.5);
        Car car2 = new Car("Innova", "White", 120);
        System.out.println("Greater speed:" + (car1.compareTo(car2) == 1 ? car1 : car2));
    }
}

class Car implements Comparable<Car>
{
    String model;
    String color;
    double speed;

    Car(String m, String c, double s) {
        this.model = m;
        this.color = c;
        this.speed = s;
    }

    public int compareTo(Car other) {
        if (this.speed < other.speed)
            return -1;
        else if (this.speed == other.speed)
            return 0;
        else
            return 1;
    }

    public String toString() {
        return "Model:" + model + "\t Color: " + color + "\t Speed: " + speed;
    }
}
