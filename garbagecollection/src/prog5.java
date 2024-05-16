class myobject{
	private int i;
	private double d;
	myobject(int i,double d){
		this.i=i;
		this.d=d;
	}
	public int get_i() {
		return i;
		
	}
	public double get_d()
	{
		return d;
	}
	public void set_i(int i)
	{
		this.i=i;
	}
	public void set_d(double d ) {
		this.d=d;
	}
}
public class prog5 {

	public static void main(String[] args) {
		System.out.println("Before creating object");
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		myobject ob1=new myobject(17,18.9);
		myobject ob2=new myobject(16,17.9);
		System.out.println("After creating object");
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
        ob1=null;
        System.gc();
        System.out.println("After making it unreachable");
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());

	}

}
