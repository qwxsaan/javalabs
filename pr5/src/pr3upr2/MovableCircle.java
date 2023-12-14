package pr3upr2;

public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed,int ySpeed, int radius){
        this.radius=radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    public void moveUp(){
        center.y+= center.ySpeed;


    }
    public void moveDown(){
        center.y-= center.ySpeed;

    }
    public void moveLeft(){
        center.x-= center.xSpeed;

    }
    public void moveRight() {
        center.x+= center.xSpeed;
    }
    public String toString(){
        return "Center: x= "+this.center.x+", y= "+this.center.y;
    }
}
