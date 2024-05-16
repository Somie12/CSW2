class Anonomyousobject{
	String name;
	Anonomyousobject (String name)
	{
		this.name=name;
	}
	private void finalise()throws Throwable{
		System.out.println("garbage is successfully collected"+" "+name);
	}
}
public class prog4 {

	public static void main(String[] args) {
            new Anonomyousobject("object1");
            System.gc();
	}

}
