package edu.sabana.poob.shapes;

public class Pyramid extends Triangle implements GeometricShape3D {

    private double height = 1.0;

    public Pyramid(){
    }

    public Pyramid(String color) {
        super(color);

    }

    public Pyramid(double side1, double side2, double side3, double height) {
        super(side1, side2, side3);
        this.height = height;
    }

    public Pyramid(String color, double side1, double side2, double side3, double height) {
        super(color, side1, side2, side3);
        this.height = height;
    }
    public double getArea(){
        return  Math.pow(side1,2)+Math.pow(height,2);
    }
    public double getPerimeter(){
        return side1*side2*side3;
    }

    @Override
    public double getVolume() {
        return (side1*side2)*height/3;
    }

    @Override
    public double getSuperficialArea() {
        return height+side1;
    }
    @Override
    public String toStringGeometricShape2D() {
        return this.toString();
    }

}
