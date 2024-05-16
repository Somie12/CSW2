interface MathOperation
{
	int Operation(int a,int b);
}
public class InterfaceMathOperation {

	public static void main(String[] args) {
MathOperation addition=(a,b) -> a+b;
MathOperation Subtraction=(a,b) -> a-b;
System.out.println(addition.Operation(10,5));
System.out.println(Subtraction.Operation(10,5));



	}

}
