package edu.sabana.poob.shapes;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PyramidTest {
    private static Pyramid p1;
    private static Pyramid p2;
    private static Pyramid p3;
    private static Pyramid p4;


    @BeforeAll
    public static void setUp() {
        p1 = new Pyramid();
        p2 = new Pyramid("Blue");
        p3 = new Pyramid(1.0, 2.0, 3.0, 4.0);
        p4 = new Pyramid("red", 5.0, 5.0, 7.0, 8.9);
    }

    @Test
    public void shouldCalculateVolume() {
        assertEquals(0.0, (int) p1.getVolume());
        assertEquals(0, (int) p2.getVolume());
        assertEquals(2.0, (int) p3.getVolume());
        assertEquals(74.0, (int) p4.getVolume());

    }
    @Test
    public void shouldCalculateSuperficialArea() {
        assertEquals(2.0, (int) p1.getSuperficialArea());
        assertEquals(2.0, (int) p2.getSuperficialArea());
        assertEquals(5.0, (int) p3.getSuperficialArea());
        assertEquals(13.0, (int) p4.getSuperficialArea());

    }
    @Test
    public void shouldCalculateArea() {
        assertEquals(2.0, (int) p1.getArea());
        assertEquals(2.0, (int) p2.getArea());
        assertEquals(17.0, (int) p3.getArea());
        assertEquals(104.0, (int) p4.getArea());

    }
    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(1.0, (int) p1.getPerimeter());
        assertEquals(1.0, (int) p2.getPerimeter());
        assertEquals(6.0, (int) p3.getPerimeter());
        assertEquals(175.0, (int) p4.getPerimeter());

    }
    @Test
    public void shouldPrintPyramid() {

        assertTrue(p1.toStringGeometricShape3D().contains("This is a Pyramid"));
        assertTrue(p2.toStringGeometricShape3D().contains("This is a Pyramid"));
        assertTrue(p3.toStringGeometricShape3D().contains("This is a Pyramid"));
        assertTrue(p4.toStringGeometricShape3D().contains("This is a Pyramid"));
    }
}