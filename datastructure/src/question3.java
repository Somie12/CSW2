import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
public class question3 {

	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(23,90,89,77,54);
		Integer max=numbers.stream().max(Integer::compare).orElseThrow();
		

	}

}
