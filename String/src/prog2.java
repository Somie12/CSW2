
public class prog2 {
	public static void main(String[]args)
	{
		String str="Hello";
		str.concat("World");//object cannot be altered but the reference variable can be changed
		System.out.println(str);
		str=str.concat("world");
		System.out.println(str);
		CharSequence ch="Immuatable";
		System.out.println(ch.charAt(4));
	}

}
