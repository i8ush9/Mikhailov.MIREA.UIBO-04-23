package Rab3;

public class Square extends Rectangle{

    protected double side;

    public Square(){
        super();
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side,String color, boolean filled){
        this.side = side;
        super();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    String ToString() {
        return super.ToString();
    }
}
