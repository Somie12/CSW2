package ErrorHandling;

public class Q3 {
    public static void main(String[] args) {
        String s = null;
        try
        {
            if(s==null)
            {
                throw new CustomNullPointerExcepetion("Error message!");
            }
        }
        catch(CustomNullPointerExcepetion e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class CustomNullPointerExcepetion extends NullPointerException
{
    public CustomNullPointerException(String s) {
        super(s);
    }
}
