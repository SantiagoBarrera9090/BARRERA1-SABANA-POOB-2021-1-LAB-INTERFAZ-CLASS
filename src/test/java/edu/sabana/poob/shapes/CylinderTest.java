package edu.sabana.poob.shapes;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CylinderTest {

    private static Cylinder c1;
    private static Cylinder c2;
    private static Cylinder c3;

    @BeforeAll
    public static void setUp() {
        c1 = new Cylinder();
        c2 = new Cylinder(14.5, 20.5);
        c3 = new Cylinder("red", 23.5, 42.1);
    }

    @Test
    public void shouldCalculateVolume() {

        assertEquals(3, (int) c1.getVolume());
        assertEquals(660, (int) c2.getVolume());
        assertEquals(1734, (int) c3.getVolume());
    }

    @Test
    public void shouldCalculateSuperficialArea() {

        assertEquals(12, (int) c1.getSuperficialArea());
        assertEquals(3188, (int) c2.getSuperficialArea());
        assertEquals(3462, (int) c3.getSuperficialArea());
    }

    @Test
    public void shouldPrintCylinder() {

        assertTrue(c1.toStringGeometricShape2D().contains("This is a Cylinder"));
        assertTrue(c2.toStringGeometricShape2D().contains("This is a Cylinder"));
        assertTrue(c3.toStringGeometricShape2D().contains("This is a Cylinder"));
    }
}
