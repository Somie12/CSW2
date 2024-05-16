package GenericsAndCollections.Part_2;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        TreeSet<Integer> st = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five elements: ");
        for(int i=0;i<5;i++)
        {
            st.add(sc.nextInt());
        }
        System.out.println("TreeSet Data: ");
        Iterator<Integer> itr = st.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }

        System.out.println("Enter number to search: ");
        int n = sc.nextInt();
        System.out.println(n + " is present " + st.contains(n));
        System.out.println("Enter an element to delete: ");
        int k = sc.nextInt();
        System.out.println("After deletion: " + st);
    }
}
