package prog1.java;

public class mycar {
   public static void main(String[]args)
   {
	   car mycar1=new car("mahendra","002");
	   System.out.println("make"+" "+mycar1.get_make()+" "+" " + "model"+" "+mycar1.get_model());
	   car mycar=new car(null,null);
	   mycar.set_make("honda");
	   mycar.set_model("003");
	   System.out.println("make"+" "+mycar.get_make()+" "+"model"+" "+mycar.get_model());
   }
}
