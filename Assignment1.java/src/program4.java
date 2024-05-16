class laptop
{
	private String model;
	private double price;
	public  String get_model()
	{
		return model;
	}
	public double get_price()
	{
		return price;
	}
	public void set_model(String model)
	{
		this.model=model;
	}
	public void set_price(double price)
	{
		this.price=price;
	}
	public String toString()
	{
		return "laptopmodel"+" "+model+" "+"price"+" "+price;
	}
}
public class program4 {

	public static void main(String[] args) {
		laptop l1=new laptop();
		l1.set_model("Asus");
		l1.set_price(45000);
		System.out.println("model"+ " "+l1.get_model()+"price"+" "+l1.get_price());
		System.out.println(l1.toString());
	}

}
