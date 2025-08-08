package Lab29_07;

public class QuizTest4 {
	public static void main(String[] args) 
    {
        int i = 1;
        try
        {
            i++;
        }
        catch (Exception e) 
        {
            i++;
        }
        finally
        {
            i++;
        }
        System.out.println(i);
    }
}

//Output 3
