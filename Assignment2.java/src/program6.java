import java.util.Objects;

class Animal
{
	private String name;
	private String color;
	private String type;
	Animal(String name,String color,String type)
	{
		this.name=name;
		this.color=color;
		this.type=type;
	}public int hashCode() {
		return Objects.hash(name,color,type);
	}
}
public class program6 {

	public static void main(String[] args) {
	 Animal myanimal=new Animal("cat","black","pet");
	 System.out.println("hash code"+myanimal.hashCode());
	}

}
