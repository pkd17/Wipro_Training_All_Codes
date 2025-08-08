package Lab25_07;

public class ShapeTest {
    public static void main(String[] args) {
        Shape2 r = new Rectangle(10, 5);
        Shape2 c = new Circle(7);
        Shape2 t = new Triangle(6, 4);

        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Triangle Area: " + t.getArea());
    }
}
