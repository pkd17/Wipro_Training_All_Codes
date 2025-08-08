package Lab23_07;

class Shape {
    double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}

