class college
{
	String collegename;
	String collegeloc;
	college(String collegename, String collegeloc){
		this.collegename=collegename;
		this.collegeloc=collegeloc;
		
	}

}
class Student extends college{
	private int sid;
	public String Studentname;
	Student(String collegename,String collegeloc,int sid,String Studentname)
	{
		super(collegename,collegeloc);
		this.sid=sid;
		this.Studentname=Studentname;
	}
	public int get_sid() {
		return sid;
	}
	public void display()
	{
		System.out.println(collegename+" "+collegeloc+" "+sid+" "+Studentname);
	}
}
public class program_05 {

	public static void main(String[] args) {
		Student s1=new Student("ITER","jagmara",03,"Tapaswini");
		s1.display();
		

	}

}
