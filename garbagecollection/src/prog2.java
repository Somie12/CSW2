class Reassigningreference{
	String name;
	Reassigningreference(String name){
		this.name =name;
	}
	void display() {
		System.out.println("name"+" "+name);
	}
	
}
public class prog2 {

	public static void main(String[] args) {
		Reassigningreference r1=new Reassigningreference("object 1");
		Reassigningreference r2=new Reassigningreference("object 1");
		r1=r2;
		System.gc();

	}

}
