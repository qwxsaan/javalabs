package classes;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius of circle is " + circle.getRadius());
        System.out.println("Diameter of circle is " + circle.getDiameter());
        System.out.println("Circumference of circle is " + circle.getCircumference());
        System.out.println("Area of circle is " + circle.getArea());
        circle.setRadius(7);
        System.out.println("New radius of circle is " + circle.getRadius());
    }
}
