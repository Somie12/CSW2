import java.util.Scanner;    
class student<r>
{

String name;
 int age;
 r rollno;





 student(String name,int age,r rollno)
 {
	 this.name=name;
	 this.age=age;
	 this.rollno=rollno;
 }
 public   r getrollno(){
	 return (r )rollno;
 }
 public  void set_rollno( r rollno)
 {
	 this.rollno= rollno;                            ;
 }
 
}

public class program1 {


	public static void main(String[] args) {
		student s1=new student("Tanushree",20,"8");
		s1.set_rollno(35);
		
		System.out.println( s1.getrollno()+" "+s1.name+" "+s1.age);		
		

	}

}
