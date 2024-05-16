import java.util.Scanner;
public class errorhandling1 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers to divide");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
