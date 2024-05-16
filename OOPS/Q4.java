import java.util.*;
public class Q4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop obj = new Laptop();
        System.out.println("Enter model: ");
        obj.setModel(sc.nextLine());
        System.out.println("Enter price: ");
        obj.setPrice(sc.nextDouble());
        System.out.println(obj);
    }
}

class Laptop
{
    private String model;
    private double price;

    String getModel()
    {
        return model;
    }
        
    double getPrice()
    {
        return price;
    }

    void setModel(String model)
    {
        this.model = model;
    }

    void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Laptop{" + "model =' " + model + '\''  + ", price = " + price + '}';

    }
}
