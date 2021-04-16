package edu.sabana.poob.shapes;

public class Square extends Rectangle{
    private double side = 1.0;
    public Square(){

    }
    public Square(String color){
        super(color);
    }
    public Square(double side){
        this.side = side;
    }
    public Square(String color, double side){
        super(color);
        this.side = side;
    }
    @Override
    public double getArea(){
        return side*side;
    }
    @Override
    public double getPerimeter() {
        return side + side + side + side;
    }
    public double getDiagonal(){
        return ((Math.pow(side, 2) + (Math.pow(side, 2))));

    }
    @Override
    public String toString() {
        return super.toString();
    }

}
