package Rab3;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
        super();
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    String ToString() {
        return "";
    }
}
