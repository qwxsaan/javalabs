package pr3upr2;

public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;
    public MovableRectangle(int x1, int x2,int y1, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public String toString(){
        return "Top left point: x= "+topLeft.x+", y= "+topLeft.y+"; Bottom right point: x= "+bottomRight.x+", y= "+bottomRight.y;
    }
    public void moveUp(){
        topLeft.y+= topLeft.ySpeed;
        bottomRight.y+= bottomRight.ySpeed;
    }
    public void moveDown(){
        topLeft.y-= topLeft.ySpeed;
        bottomRight.y-= bottomRight.ySpeed;
    }
    public void moveLeft(){
        topLeft.x-= topLeft.xSpeed;
        bottomRight.x-= bottomRight.xSpeed;
    }
    public void moveRight(){
        topLeft.x+= topLeft.xSpeed;
        bottomRight.x+= bottomRight.xSpeed;

    }
    public boolean checkSpeed(){
        if ((this.topLeft.xSpeed==this.bottomRight.xSpeed)&&(this.topLeft.ySpeed==this.bottomRight.ySpeed)) return true;
        else return false;
    }

}
