import java.util.Scanner;

import jdk.security.jarsigner.JarSigner.Builder;
public class prog3 {

	public static void main(String[] args) {
StringBuffer buffer=new StringBuffer();
Scanner sc=new Scanner(System.in);
while(true)
{
	System.out.println("\n1Append\n2insert\n3delete\n3reverse\n4relace\n5Exit");
	System.out.println("Enter an operation");
	int choice=sc.nextInt();
	sc.nextLine();
	switch(choice)
	{
	case 1:
		System.out.println("Enter String to Append");
		buffer.append(sc.nextLine());
		break;
	case 2:
		System.out.println("Enter index and String to insert");
		int index=sc.nextInt();
		sc.nextLine();
		buffer.insert(index,sc.nextLine());
		break;
	case 3:
		System.out.println("Enter  Start and nd Indices");
		int start=sc.nextInt();
		int end=sc.nextInt();
		buffer.delete(start, end);
		break;
	case 4:
		buffer.reverse();
		break;
	case 5:
		System.out.println("Enter start and end indices to replace");
		 start=sc.nextInt();
		 end=sc.nextInt();
		 sc.nextLine();
		 buffer.replace(start, end,sc.nextLine());
		 break;
	case 6:
		System.exit(0);
		break;
		default:
			System.out.println("invalid choice");
	}
			System.out.println("current buffer"+buffer);
			System.out.println("Length: " + buffer.length() + ", Capacity: " + buffer.capacity());

	
	
			}
	}

}
