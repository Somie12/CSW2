import java.util.Scanner;
public class prog1 {

	public static void main(String[] args) {
		String s1="Java";//stored in stack
		String s2="Java";
		String s3=new String("Java");//stored in heap
		String s4=new String("Java");
		System.out.println(s1==s2);//objects are stored in same memory location
		System.out.println(s3==s4);//objects are stored in different memory location
	     System.out.println(s1.equals(s4));// content is same

	}

}
