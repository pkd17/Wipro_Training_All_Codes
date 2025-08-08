package Lab31_07;

public class LabQuestion5 {
    public static void main(String[] args) {
        printNumbers(1);
    }

    public static void printNumbers(int n) {
        if (n <= 100) {
            System.out.println(n);
            printNumbers(n + 1); // recursive call
        }
    }
}
