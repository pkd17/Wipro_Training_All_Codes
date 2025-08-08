package Lab29_07;

public class QuizTest2 {
	public static void main(String[] args) 
    {   
        try
        {
            System.out.println(1);
        }
        catch (Exception e) 
        {
            System.out.println(2);
        }
        System.out.println(3);
        finally
        {
            System.out.println(4);
        }
    }
}
// cannot have statements between catch and finally  block
