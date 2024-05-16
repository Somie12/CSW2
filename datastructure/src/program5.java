import java.util.HashMap;
import java.util.Map;
public class program5 {
	public static void main(String[]args)
	{
	Map<String,Integer>namelength=new HashMap<>();	
	namelength.put("Arya", 5);
	namelength.put("suman", 3);
	namelength.put("sid", 7);
	namelength.forEach((name,length) -> System.out.println(name+""+" has name of length"+" "+length));
	}

}
