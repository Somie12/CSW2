import java.util.Scanner;
public class program6 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two String");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String Str1lower=str1.toLowerCase();
		String str2lower=str2.toLowerCase();
		System.out.println("lower versions"+Str1lower+" "+str2lower);
		System.out.println("Upper versions"+str1.toUpperCase()+" "+str2.toUpperCase());
		boolean arequalignoring=Str1lower.equals(str2lower);
		System.out.println("TwoStrings are equal case Sensitive?"+aretqualignoring);
	}

}
