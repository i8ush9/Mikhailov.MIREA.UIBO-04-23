package Rab56;

public class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center = new MovablePoint(1,2,3,4);

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp(){
        y+=ySpeed;
    }

    public void moveDown(){
        y-=ySpeed;
    }
    public void moveLeft(){
        x-=xSpeed;
    }
    public void moveRight(){
        x+=xSpeed;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }
}
