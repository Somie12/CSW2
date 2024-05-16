package GenericsAndCollections.Part_2;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> ob = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, plot number and address of two person: ");
        for (int i = 0; i < 2; i++)
        {
           String nm = sc.nextLine();
           int plot_no = sc.nextInt();
           sc.nextLine();
           String at = sc.nextLine();
           String post = sc.nextLine();
           ob.put(nm, new Address(plot_no, at, post));

        }
        Iterator<Map.Entry<String, Address>> itr = ob.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<String, Address> entry = itr.next();
            System.out.println("Name: " + entry.getValue());
            System.out.println("Address: " + entry.getValue());

        }
    }
}
class Address {
    int plot_no;
    String at, post;

    public Address(int plot_no, String at, String post) {
        this.plot_no = plot_no;
        this.at = at;
        this.post = post;
    }

    public String toString() {
        return "\tPlot No : " + plot_no + " Area Type : " + at + " Post Office : " + post;
    }
}