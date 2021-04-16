package edu.sabana.poob.shapes;

public class Cube extends RectangleSolid{
    private double side;

    public Cube() {

    }

    public Cube(String color) {
        super(color);
    }
    public Cube (double side){
        this.side = side;
    }
    public Cube (String color, double side){
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.pow(side,2));
    }

    @Override
    public double getPerimeter() {
        return 12*side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side,3);
    }

    @Override
    public double getSuperficialArea() {
        return 6*(Math.pow(side,2));
    }
}
