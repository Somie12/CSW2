package GenericsAndCollections.Part_2;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        LinkedList<Student> ob = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 student detail");
        for(int i=0;i<2;i++)
        {
            Student s1 = new Student();
            s1.setName(sc.next());
            s1.setAge(sc.nextInt());
            s1.setMarks(sc.nextDouble());
            ob.add(s1);
        }
        for (Student i : ob) {
            System.out.println(i);
        }

        System.out.println("Enter Student details to search:");
        Student temp = new Student();
        temp.setName(sc.next());
        temp.setAge(sc.nextInt());
        temp.setMarks(sc.nextDouble());
        for (Student j : ob) {
            if (j.equals(temp)) {
                System.out.println("Found");
            }
        }

        System.out.println("No. of objects in list:" + ob.size());
        System.out.println("Enter Student details to remove:");
        temp.setName(sc.next());
        temp.setAge(sc.nextInt());
        temp.setMarks(sc.nextDouble());
        for (Student k : ob) {
            if (k.equals(temp)) {
                ob.remove(k);
            }
        }
    }
}
class Student {
    String name;
    int age;
    double mark;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return this.mark;
    }

    public void setMarks(double mark) {
        this.mark = mark;
    }

    public String toString() {
        return "Student Name : " + this.getName() + "\t" +
                "Student Age: " + this.getAge() + "\t" +
                "Student Marks : " + this.getMarks();
    }

    public boolean equals(Student obj) {
        return this.age == obj.age && this.mark == obj.mark && this.name.equals(obj.name);
    }
}