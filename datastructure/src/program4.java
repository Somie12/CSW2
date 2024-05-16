import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class person
{
	String name;
	int age;
	person(String name, int age)
	{
		this.name=name;this.age=age;
	}
	public String ToString()
	{
		return name+" "+age;
	}
}
public class program4 {

	public static void main(String[] args) {
		List<person>people=new ArrayList<>();
		people.add(new person("person1",22));
		people.add(new person("person2",25));
		people.add(new person("person5",29));
//Sorting using lamda expression//
		Collections.sort(people,(p1,p2) -> p1.age-p2.age);
		System.out.println("sorted by age"+ people);


	}

}
