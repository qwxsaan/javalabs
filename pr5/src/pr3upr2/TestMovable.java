package pr3upr2;

public class TestMovable {
    public static void main(String[] args){
        MovableCircle circle = new MovableCircle(5,10,1,1,5);
        MovableRectangle rectangle = new MovableRectangle(1,6,1,10,1,1);
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);

        System.out.println(rectangle);
        rectangle.moveDown();
        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println(rectangle);
        rectangle.moveLeft();
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);
    }

}
