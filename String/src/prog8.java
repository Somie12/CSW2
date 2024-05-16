import java.util.Scanner;
public class prog8 {
public static void main(String[]args) {
	System.out.println("Enter two Strings");
	Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	String concatmethode=str1.concat(str2);
	String plusmethode=str1+str2;
	System.out.println("through concat"+concatmethode);
	System.out.println("through olus"+plusmethode);
	int index=sc.nextInt();
	if(index>=0&&index<plusmethode.length())
	{
	
	System.out.println("char at index"+index+""+plusmethode.charAt(index));
	}
	else {
		System.out.println("out of range");
	}
}
}