package Lab25_07;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", "97812345");
        Book b2 = new Book("Wrwin Kreyszig", "Erwin", "97801323");

        b1.getBookInfo();
        b2.getBookInfo();
        b1.issueBook();  
        b1.getBookInfo();
        b1.issueBook();
        b1.returnBook();  
        b1.getBookInfo();
        b2.issueBook();   
        b2.getBookInfo();
    }
}

