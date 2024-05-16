import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class program6 {


	public static void main(String[] args) {
		List <Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List <Integer>lessthan10numbers=numbers.stream().filter(n ->n<10).collect(Collectors.toList());
		System.out.println(lessthan10numbers);


	}

}
