import java.util.Scanner;
 abstract class libraryResource{
	private String title;
	private String author;
	libraryResource(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
	public String get_title()
	{
		return title;
		
	}
	public String get_author()
	{
		return author;
	}
	public void set_title(String title)
	{
		this.title=title;
	}
	public void set_author(String author)
	{
		this.author=author;
	}
	public abstract void displaydetails();
}
class book extends libraryResource{
	private int pagecount;
	public book(String title, String author,int pagecount)
	{
		super(title,author);
		this.pagecount=pagecount;
	}
	public int get_pagecount()
	{
		return pagecount;
	}
	public void set_pagecount()
	{
		this.pagecount=pagecount;
	}
	public void displaydetails()
	{
		System.out.println(get_title()+"  "+get_author()+" "+get_pagecount());
	}
}
class magazine extends libraryResource{
	private String issuedate;
	public magazine(String title, String author,String issuedate)
	{
		super(title,author);
		this.issuedate=issuedate;
	}
	public String get_issuedate()
	{
		return issuedate;
	}
	public void set_isssuedate(String issuedate)
	{
		this.issuedate=issuedate;
	}
	public void displaydetails()
	{
		System.out.println(get_title()+"  "+get_author()+" "+get_issuedate());
	}
}
class DVD extends libraryResource{
	private int duration;
	public DVD(String title, String author,int duration)
	{
		super(title,author);
		this.duration=duration;
	}
	public int get_duration()
	{
		return duration;
		
	}
	public void set_duration(int duration)
	{
		this.duration=duration;
	}
	public void displaydetails()
	{
		System.out.println(get_title()+"  "+get_author()+" "+get_duration());
	}
}





public class program6 {
	public static void main(String []args)
	{
		libraryResource b=new book("it starts with us","edda",230) ;
		libraryResource b1=new magazine("it starts with us","edda","12:03:23") ;
		libraryResource b3=new DVD("it starts with us","edda",20) ;
		b.displaydetails();
		b1.displaydetails();
		b3.displaydetails();
	}

}
