package edu.sabana.poob.shapes;



public class Rectangle extends Shape implements GeometricShape2D {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(){

    }
    public Rectangle(String color){
        super(color);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }
    //constructor laboratorio anterior
    public double getDiagonal(){
        return (Math.sqrt((Math.pow(length, 2) + (Math.pow(width, 2)))));

    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }


    public String toStringGeometricShape2D() {
        return "This is a Rectangle with area and perimeter"+ this.getArea()+ this.getPerimeter();
    }


}
