package Lab29_07;

public class QuizTest5 {
	public static void main(String[] args) 
    {
        try
        {
            System.out.println("Try Block");
        }
        System.out.println("-----");
        catch (Exception e) 
        {
            System.out.println("Catch Block");
        }
    }
}

// cannot have statements between a try block and its catch block