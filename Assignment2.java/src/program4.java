class Student{
	private String name;
	private int rn;
	private int totalmark;
	Student(String name,int rn,int totalmark)
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
	public int compareTo(Student otherStudent) {
		if(this.rn>otherStudent.rn)
		{
			return 1;
		}
		return 0;
		
}
public class program4 {

	public static void main(String[] args) {
		   
		Student[] s= {
				new Student("ram",04,89),
				new Student("rii",06,87),
				new Student("piiiii",8,99)
		};
		

	}

}
}
