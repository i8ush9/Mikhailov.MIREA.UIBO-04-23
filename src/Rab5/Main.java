package Rab5;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(3,3,11,5);
        System.out.print(point);
        point.moveUp();
        point.moveRight();
        System.out.print("\n");
        System.out.print(point);
    }
}
