package GenericsAndCollections.Part_2;



import java.util.HashSet;
import java.util.Set;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int missing = 1;
        while (set.contains(missing)) {
            missing++;
        }
        System.out.println("The smallest positive number missing in the array is: " + missing);
    }
}