package edu.sabana.poob.shapes;



public class Triangle extends Shape implements GeometricShape2D {
    protected double side1 = 1.0;
    protected double side2 = 1.0;
    protected double side3 = 1.0;

    public Triangle() {

    }
    public Triangle(String color) {
        super(color);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return (side2 * Math.sqrt((Math.pow(side3, 2) - (Math.pow(side2, 2) / 4)))) / 2;
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }
    //constructor laboratorio anterior
    public boolean isIsosceles(){
        if(side1 == side2);
        return true;
    }
    //constructor laboratorio anterior
    public boolean isEquilateral(){
        if(side1 == side2 && side2 == side3 && side1 == side3);
        return true;
    }


    public String toStringGeometricShape2D() {
        return "This is a Triangle with area and perimeter"+ this.getArea()+ this.getPerimeter();
    }
}
