package Rab5;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint centre;

    public MovableCircle(int radius, MovablePoint centre) {
        this.radius = radius;
        this.centre = centre;
    }
    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", centre=" + centre +
                '}';

    }

    @Override
    public void moveUp() {
        this.centre.y+= centre.ySpeed;
    }

    @Override
    public void moveDown() {
        this.centre.y-= centre.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.centre.x-= centre.xSpeed;
    }

    @Override
    public void moveRight() {
        this.centre.x+= centre.xSpeed;
    }
}
