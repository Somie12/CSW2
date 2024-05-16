import java.util.Scanner;
public class prog7 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();
	char[]CharArray=str1.toCharArray();
	System.out.println("enter the elements to Search for");
	char Searchchar=sc.next().charAt(0);
	int firstindex=str1.indexOf(Searchchar);
	int lastindex=str1.lastIndexOf(Searchchar);
	for(char c:CharArray)
	{
		System.out.println(c+"");
		
	}
	System.out.println("\nFirst occurrence of '" + Searchchar + "': " + firstindex);
	System.out.println("Last occurrence of '" + Searchchar + "': " + lastindex);
	
}
}
