package Lab18_07;

public class Max {

    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;

        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("The maximum number is: " + max);
    }
}
