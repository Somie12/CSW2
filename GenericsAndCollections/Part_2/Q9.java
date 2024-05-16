package GenericsAndCollections.Part_2;
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> ht = new HashSet<>();
        HashSet<Integer> rpt = new HashSet<>();

        for( int i : arr)
        {
            if(ht.contains(i))
            {
                rpt.add(i);
            }
            ht.add(i);
        }
        System.out.println(rpt + " are repeated numbers.");
    }
}
