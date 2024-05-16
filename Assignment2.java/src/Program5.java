
class Student1{
	private String name;
	private int rn;
	private int totalmark;
	Student1(String name,int rn,int totalmark)
	{
		this.name=name;
		this.rn=rn;
		this.totalmark=totalmark;
	}
	public String get_name()
	{
		return name;
	}
	public int get_rn()
	{
		return rn;
	}
	public int get_totalmark()
	{
		return  totalmark;
	}
	public int compareTo(Student1 otherStudent) {
		if(this.rn>otherStudent.rn)
		{
			return 1;
		}
		return 0;
		
	}
}
public class Program5 {

	public static void main(String[] args) {
      Student1 []s=new Student1[5];
      s[0]=new Student1("john",1,450);
      s[0]=new Student1("jiya",3,678);
      s[0]=new Student1("jim",4,780);
      s[0]=new Student1("Siya",5,444);
      s[0]=new Student1("jat",5,666);


	}

}
