
class book <x,y,z>{
	private x studentid;
	  private y bookname;
	  private z price;
	  
	  public <x> x get_studentid()
	  {
		  return  (x) studentid;
	  }
	  public <y> y get_bookname()
	  {
		  return (y) bookname;
			
	  }
	  public <z> z get_price()
	  {
		  return (z) price;
	  }
	  public void set_studentid(x studentid)
	  {
		  this.studentid=studentid;
	  }
	  public void set_bookname(y bookname) {
		  this.bookname=bookname;
	  }
	  public void set_price(z price) {
		  this.price=price;
	  }
	  public String toString() {
		  return studentid+" "+bookname+" "+price;
	  }
	  public boolean equals(Object other)
	  {
		  if(other instanceof book) {
			 book b=(book)other;
			 return this.price.equals(b.price);
		  }
		  return false;
	  }
		}
public class program2 {

	public static void main(String[] args) {
		book b=new book();
		book b2=new book();
		b.set_bookname("It starts");
		b.set_studentid(002);
		b.set_price(2400);
		System.out.println(b.get_bookname()+" "+b.get_studentid()+" "+b.get_price());
		b2.set_bookname("It Ends");
		b.set_studentid(003);
		b2.set_price(2400);
		System.out.println(b2.get_bookname()+" "+b2.get_studentid()+" "+b2.get_price());
		System.out.println(b.toString());
		System.out.println(b.get_price().equals(b2.get_price()));
		
		

	}

}
