package Lab18_07;

public class Greetings 
{
    public void greet(String name) {
        System.out.println("Welcome, " + name);
    }

    public static void main(String[] args) 
    {
    	Greetings g=new Greetings();
        g.greet("Pratyush");
    }
}
