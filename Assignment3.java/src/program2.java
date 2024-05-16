import java.util.*;
class  User
{
private String name;
private int age;
public User(String name,int age)
{
	this.name=name;
	this.age=age;
}
public String get_name()
{
	return name;
}
public int get_age()
{
	return age;
}
public void set_name(String name)
{
	this.name=name;
}
public void set_age(int age)
{
	this.age=age;
}
}
class ArrayListUser{
	private ArrayList<User> users=new ArrayList<>();
	public static void addUser(User user)
	{
		users.add(user);
	}
	public void printUsers()
	{
		System.out.println("Name\tage");
		for(User user:users)
		{
			System.out.println(user.get_name()+"/t"+user.get_age());
		}
		
	}
	public void sortUsersbyAge()
	{
		Collections.sort(users,Comparator.comparingInt(User::get_age));
	}
	public void printSortedUsers()
	{
		System.out.println("name \tage sorted by age");
		for(User user:users)
		{
			System.out.println(user.get_name()+"\t"+user.get_age());
		}
	}
}

public class program2 {
	

	public static void main(String[] args) {
	ArrayListUser arraylistUser=new ArrayListUser();
	ArrayListUser.addUser(new User("Alice",24));

	}

}
