import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class filehandling {
	//create file
	public static void main(String[]args)
	{
		File file=new File("My basics");
		try {
		if(file.createNewFile())
		{
			System.out.println("File created Successfully");
		}
		else
		{
			System.out.println("File already exist");
		}
		}
		catch(IOException e )
		{
			System.out.println("File cannot be created"+" "+e.getMessage());
		}
		//check if exists
		if(file.exists()) {
			System.out.println("File already exist");
			
		}
		else {
			System.out.println("File doesent exist");
		}
		try
		{
			FileWriter writer=new FileWriter(file);
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter date");
		    String date=sc.nextLine();
		    writer.write(date+"\n");
		    writer.close();
		    System.out.println("File Written Successfully");
		    
		 
		}
		catch(IOException e)
		{
			System.out.println("File is not written"+" "+e.getMessage());
		}
		try
		{
			FileWriter writer=new FileWriter(file,true);
			Scanner sc=new Scanner(System.in);
			writer.write("Data appended successfully \n");
			 System.out.println("Enter date");
			  String date=sc.nextLine();
			writer.write(date);
			writer.close();
			
			System.out.println("File appended");
		}
		catch(IOException e){
			System.out.println("File cannot be appended");
		}
		try
		{
			FileReader reader=new FileReader(file);
			Scanner sc=new Scanner(reader);
			while(sc.hasNextLine())
			{
			String line=sc.nextLine()	;
			System.out.println(line);
			}
			sc.close();
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("File cannot be read");
		}
		
	}

}
