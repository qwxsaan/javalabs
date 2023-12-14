package lab1;
import java.lang.*;
public class Ball {
    private String color;
    private int radius;
    public Ball(String n, int a){
        color = n;
        radius = a;
    }
    public Ball(String n){
        color = n;
        radius = 0;
    }
    public Ball(){
        color = "Blue";
        radius = 10;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return this.color+", radius "+this.radius;
    }
}
