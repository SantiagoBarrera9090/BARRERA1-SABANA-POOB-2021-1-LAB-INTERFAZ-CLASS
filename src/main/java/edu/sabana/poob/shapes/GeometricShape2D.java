package edu.sabana.poob.shapes;

public interface GeometricShape2D {

    /**
     * Calcula el área de una Figura geometrica en 2D.
     * <br><br>
     *
     * @return El área
     */
    double getArea();

    /**
     * Calcula el perimetro de una Figura geometrica en 2D.
     * <br><br>
     *
     * @return El perimetro
     */
    double getPerimeter();


    default String toStringGeometricShape2D() {
        return String.format("This is a %s with area %s and perimeter %s"
                , this.getClass().getName()
                , this.getArea()
                , this.getPerimeter());
    }
}
