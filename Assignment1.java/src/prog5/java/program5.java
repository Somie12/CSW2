package prog5.java;
class College
{
 String collegename;
 String collegeloc;
 College(String collegename,String collegeloc )
 {
	 this.collegename=collegename;
	 this.collegeloc=collegeloc;
 }
}
 
public class program5 {
public static void main(String[]args)
{
	College c1=new College("Iter","jagmara");
	student s1=new student();
	s1.set_Studentid(03);
	s1.set_Studentname("soumya");
	System.out.println("collegename"+" "+c1.collegename+" "+"collegeloc"+" "+c1.collegeloc+" "+"Studentid"+s1.get_Studentid()+"studentname"+s1.get_Studentname());
}
}
