package edu.sabana.poob.shapes;



public class Cylinder extends Circle implements GeometricShape3D {

    private double height;
    private static final double PI = Math.PI;


    public Cylinder() {
        super();

    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }


    @Override
    public double getVolume() {
        return PI*(Math.pow(radius,2));
    }

    @Override
    public double getSuperficialArea() {
        return 2*PI*this.radius*2*PI*(Math.pow(radius,2));
    }
    @Override
    public String toStringGeometricShape3D() {
        return "This is a Cylinder";
    }
}
