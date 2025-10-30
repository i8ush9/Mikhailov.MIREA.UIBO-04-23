package Rab67;

public class MovableRectangle implements Movable{

    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    private int xSpeed;
    private int ySpeed;

    public MovableRectangle() {
    }

    public MovableRectangle(int x1 ,int y1 ,int x2,int y2,int xSpeed, int ySpeed ) {
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    @Override
    public void moveUp() {
        topLeft.ySpeed += ySpeed;
        bottomRight.ySpeed += ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.ySpeed -= ySpeed;
        bottomRight.ySpeed -= ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.xSpeed -= xSpeed;
        bottomRight.xSpeed -= xSpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveRight() {
        topLeft.xSpeed += xSpeed;
        bottomRight.xSpeed += xSpeed;


    }
}
