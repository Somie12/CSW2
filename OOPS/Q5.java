import java.util.*;
public class Q5 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter college1 name: ");
        String collegeName = sc.nextLine();
        System.out.println("Enter college location: ");
        String collegeLoc = sc.nextLine();
        
        College c1 = new College(collegeName , collegeLoc);

        System.out.println("Enter student1 name:  ");
        String studentName = sc.nextLine();
        System.out.println("Enter student1 id: ");
        int studentId = sc.nextInt();

        Student s1 = new Student(studentId, studentName,c1);
        
    }
}

class College
{
  private String collegeName;
  private String collegeLoc;

  College(String collegeName, String collegeLoc)
  {
    this.collegeName = collegeName;
    this.collegeLoc = collegeLoc;
  }
  String getCollegeName()
  {
    return collegeName;
  }
  String getCollegeLoc()
  {
    return collegeLoc;
  }
}

class Student
{
    private int studentId;
    private String studentName;
    private College college;

    Student(int studentId, String studentName, College college)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    void displayInfo()
    {
        System.out.println("Student id: " + studentId);
        System.out.println("Student name: " + studentName);

        System.out.println("College name: " + college.getCollegeName());
        System.out.println("College location: " + college.getCollegeLoc());
    }
}
