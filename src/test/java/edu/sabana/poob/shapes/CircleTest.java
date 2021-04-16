package edu.sabana.poob.shapes;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircleTest {

    private static Circle c1;
    private static Circle c2;
    private static Circle c3;
    private static Circle c4;

    @BeforeAll
    public static void setUp() {
        c1 = new Circle(10);
        c2 = new Circle(14.5);
        c3 = new Circle("red", 23.5);
        c4 = new Circle();
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(314, (int) c1.getArea());
        assertEquals(660, (int) c2.getArea());
        assertEquals(1734, (int) c3.getArea());
        assertEquals(3, (int) c4.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(62, (int) c1.getPerimeter());
        assertEquals(91, (int) c2.getPerimeter());
        assertEquals(147, (int) c3.getPerimeter());
        assertEquals(6, (int) c4.getPerimeter());
    }

    @Test
    public void shouldCalculateDiameter() {

        assertEquals(20, (int) c1.getDiameter());
        assertEquals(29, (int) c2.getDiameter());
        assertEquals(47, (int) c3.getDiameter());
        assertEquals(2, (int) c4.getDiameter());
    }

    @Test
    public void shouldPrintCircle() {

        assertTrue(c1.toStringGeometricShape2D().contains("This is a Circle"));
        assertTrue(c2.toStringGeometricShape2D().contains("This is a Circle"));
        assertTrue(c3.toStringGeometricShape2D().contains("This is a Circle"));
        assertTrue(c4.toStringGeometricShape2D().contains("This is a Circle"));
    }

}
