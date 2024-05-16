class Nullreference{
	String name;
	Nullreference(String name)
	{
		this.name=name;
	}
	private void finalise()throws Throwable{
		System.out.println("garbage is successfully collected"+ name);
		
	}
}
public class prog3 {

	public static void main(String[] args) {
	Nullreference r1=new Nullreference("object1");
	r1=null;
	System.gc();

	}

}
