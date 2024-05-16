import java.util.Arrays;
import java.util.List;
public class prog1 {

	public static void main(String[] args) {
		List<String>names=Arrays.asList("mon","tue","wed");
		names.forEach(name -> System.out.println(name));
		//using lamda expression to print all name//

	}

}
