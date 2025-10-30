package Rab67;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner s = new Scanner(System.in);

        System.out.println("Введите x1");
        int x1 = s.nextInt();
        System.out.println("Введите y1");
        int y1 = s.nextInt();
        System.out.println("Введите x2");
        int x2 = s.nextInt();
        System.out.println("Введите y2");
        int y2 = s.nextInt();
        System.out.println("Введите xSpeed");
        int xSpeed = s.nextInt();
        System.out.println("Введите ySpeed");
        int ySpeed = s.nextInt();

        MovableRectangle r1 = new MovableRectangle(x1,y1,x2,y2,xSpeed,ySpeed);
        System.out.println(r1);
        System.out.println(r1.getBottomRight());
        System.out.println(r1.getTopLeft());
        System.out.println(r1.getxSpeed());
        System.out.println(r1.getySpeed());
    }
}
