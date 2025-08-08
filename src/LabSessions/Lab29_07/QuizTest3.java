package Lab29_07;

public class QuizTest3 {
	public static void main(String[] args) 
    {   
        try
        {
            System.out.println(1);
            int i = 100 / 0;
            System.out.println(2);
        }
        catch (Exception e) 
        {
            System.out.println(3);
        }
    }
}
	
	/*
	 * Output
	 * 1
	 * 3
	 */


