package lab1;
import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball d1 = new Ball("Red", 15);
        Ball d2 = new Ball("White", 10);
        Ball d3 = new Ball("Blue");
        d3.setRadius(1);
        System.out.println(d1);
        System.out.println(d2);
        d3.setRadius(17);
        System.out.println(d3);
    }

}
