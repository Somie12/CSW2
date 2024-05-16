package GenericsAndCollections.Part_1;

public class Q1 
{
    public static void main(String[] args) {
        Student <Integer> a = new Student<>("Somie", 1, 40);
        Student <String> b = new Student<>("Surbhi", "2", 36);
    }
    
}
class Student <T>
{
    String name;
    int age;
    T roll;

    Student(String name, T roll, int age)
    {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }
    public String toString()
    {
        return "Name " + name + " Roll " + roll + " Age " + age;
    }
}