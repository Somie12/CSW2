
package GenericsAndCollections.Part_1;
import java.util.*;

public class Q4 
{
    public static void main(String[] args) {
        Student arr[] = new Student[3];
        System.out.println("Enter three student details: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arr[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt());
    }
    System.out.print("Enter student data to search: ");
        Student s = new Student(sc.next(), sc.nextInt(), sc.nextInt());
        boolean isFound= false;
        for (int i = 0; i < 3; i++) {
            if (arr[i].compareTo(s) == 0) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
}
}

class Student implements Comparable<Student>
{
    String name;
    int rn;
    int totalMark;

    Student(String n, int r, int m) {
        this.name = n;
        this.rn = r;
        this.totalMark = m;
    }

    public int compareTo(Student stu) {
        return this.rn == stu.rn && this.name.equals(stu.name) && this.totalMark == stu.totalMark ? 0 : -1;
    }
}
