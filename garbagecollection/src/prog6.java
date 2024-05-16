class Student{
	String name;
	private int id;
	private String course;
	Student(String name, int id ,String course){
		this.name=name;
		this.id=id;
		this.course=course;
	}

		
	
public void finalise()throws Throwable{
	System.out.println("Garbage is successfully collected");
}
public int get_id() {
	return id;
}
	public int String_course() {
		return id;
	}
	public int String_name() {
		return id;
	}
}	

public class prog6 {

	public static void main(String[] args) {
	Student s1=new Student("java",1,"Cse");
	Student s2=new Student("opps",3,"Cseit");
	System.out.println("Totalmemory before garbage collected"+" "+Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory());
	
	System.gc();
	System.out.println("Totalmemory before garbage collected"+" "+Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory());
	private  static printheapinfo();
	try {
		Threadsleep(1000);
	}
	catch(InterruptException e) {
		e.stackTrace();
	}
		}
	}

}
