package prog5.java;
class student 
{
private int Studentid;
 String Studentname;
 public int get_Studentid()
 {
	 return Studentid;
 }
 public String get_Studentname() {
	 return Studentname;
 }
 
 public void set_Studentid(int Studentid)
 {
	 this.Studentid=Studentid;
 }
 public void set_Studentname(String Studentid)
 {
	 this.Studentname=Studentname;
 }
}
public class Student {
public static void main(String[]args)
{
	College c1=new College("Iter","jagmara");
	student s1=new student();
	s1.set_Studentid(03);
	s1.set_Studentname("soumya");
	System.out.println("collegename"+" "+c1.collegename+" "+"collegeloc"+" "+c1.collegeloc+" "+"Studentid"+s1.get_Studentid()+"studentname"+s1.get_Studentname());
}


	
	

}
