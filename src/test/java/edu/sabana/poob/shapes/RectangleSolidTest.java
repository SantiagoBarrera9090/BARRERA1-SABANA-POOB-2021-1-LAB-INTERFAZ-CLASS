package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleSolidTest {
    private static RectangleSolid rt1;
    private static RectangleSolid rt2;
    private static RectangleSolid rt3;
    private static RectangleSolid rt4;


    @BeforeAll
    public static void setUp() {
        rt1 = new RectangleSolid();
        rt2 = new RectangleSolid("Blue");
        rt3 = new RectangleSolid(2.0, 3.0, 4.0);
        rt4 = new RectangleSolid("red", 5.0, 5.0, 7.0);
    }

    @Test
    public void shouldCalculateVolume() {
        assertEquals(1.0, (int) rt1.getVolume());
        assertEquals(1.0, (int) rt2.getVolume());
        assertEquals(24.0, (int) rt3.getVolume());
        assertEquals(175.0, (int) rt4.getVolume());

    }

    @Test
    public void shouldCalculateSuperficialArea() {
        assertEquals(6.0, (int) rt1.getSuperficialArea());
        assertEquals(6.0, (int) rt2.getSuperficialArea());
        assertEquals(52.0, (int) rt3.getSuperficialArea());
        assertEquals(190.0, (int) rt4.getSuperficialArea());

    }

    @Test
    public void shouldPrintPyramid() {

        assertTrue(rt1.toStringGeometricShape3D().contains("This is a RectangleSolid"));
        assertTrue(rt2.toStringGeometricShape3D().contains("This is a RectangleSolid"));
        assertTrue(rt3.toStringGeometricShape3D().contains("This is a RectangleSolid"));
        assertTrue(rt4.toStringGeometricShape3D().contains("This is a RectangleSolid"));
    }

}
