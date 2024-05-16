class unreachableobject {
	String name;
	unreachableobject(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("Garbage is successfully collected"+name);
	}
  private void finalise()throws Throwable{
	  System.out.println("Garbage is succesfully collected"+name);
	  super.finalize();
  }
}
public class prog1 {
	void show(String name)
	{
		unreachableobject ob=new unreachableobject(name) ;
		ob.display();
	}
	public static void main(String[]args)
	{
	   prog1 gc=new prog1();
	   gc.show("object1");
	   System.gc();
	}

}
