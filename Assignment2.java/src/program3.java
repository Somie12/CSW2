import java.util.*;
class Car{
	private String model;
	private String color;
	private double speed;
	public int rn;
	public String name;
	Car(String model,String color,double speed)
	{
		this.model=model;
		this.color=color;
		this.speed=speed;
	}
	public String get_model()
	{
		return model;
	}
	public String get_color()
	{
		return color;
	}
	public double get_speed()
	{
		return speed;
	}
	public int compareTo(Car otherCar) {
		if(this.speed>otherCar.speed)
		{
			return 1;
		}
		return 0;
	}
}

public class program3 {

	public static void main(String[] args) {
		Car b=new  Car("Duster","blue",250.56);
		Car b1=new Car("Mahendra","black",250.56);
		int comparisionResult=b.compareTo(b1);

		if(comparisionResult>0)
		{
			System.out.println("car1 has greater speed");
			System.out.println("Model:"+b.get_model()+" "+"color"+" "+b.get_color()+" "+"speed"+" "+b.get_speed());
		}
		else if(comparisionResult<0)
		{
			System.out.println("car2 has greater speed");
			System.out.println("Model:"+b1.get_model()+" "+"color"+" "+b1.get_color()+" "+"speed"+" "+b1.get_speed());
		}
		else
		{
			System.out.println("both have same speed");
		}
	
		
	}

}
