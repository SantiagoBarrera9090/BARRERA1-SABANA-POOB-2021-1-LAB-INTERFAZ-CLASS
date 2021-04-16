package edu.sabana.poob.shapes;

public interface GeometricShape3D {

    /**
     * Calcula el volumen de una Figura geometrica en 3D.
     * <br><br>
     *
     * @return El volumen
     */
    double getVolume();

    /**
     * Calcula el área superficial de una Figura geometrica en 3D.
     * <br><br>
     *
     * @return El área superficial
     */
    double getSuperficialArea();


    default String toStringGeometricShape3D() {
        return String.format("This is a %s with volume %s and superficial area %s"
                , this.getClass().getName()
                , this.getVolume()
                , this.getSuperficialArea());
    }
}
