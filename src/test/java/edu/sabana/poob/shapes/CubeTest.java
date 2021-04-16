package edu.sabana.poob.shapes;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CubeTest {
    private static Cube c1;
    private static Cube c2;
    private static Cube c3;
    private static Cube c4;


    @BeforeAll
    public static void setUp() {
        c1 = new Cube();
        c2 = new Cube("Blue");
        c3 = new Cube("Red", 4.0);
        c4 = new Cube("red", 5.0);
    }

    @Test
    public void shouldCalculateVolume() {
        assertEquals(1.0, (int) c1.getVolume());
        assertEquals(1.0, (int) c2.getVolume());
        assertEquals(64.0, (int) c3.getVolume());
        assertEquals(125.0, (int) c4.getVolume());

    }

    @Test
    public void shouldCalculateSuperficialArea() {
        assertEquals(6.0, (int) c1.getSuperficialArea());
        assertEquals(6.0, (int) c2.getSuperficialArea());
        assertEquals(96.0, (int) c3.getSuperficialArea());
        assertEquals(150.0, (int) c4.getSuperficialArea());

    }
    @Test
    public void shouldCalculateArea() {
        assertEquals(1.0, (int) c1.getArea());
        assertEquals(1.0, (int) c2.getArea());
        assertEquals(16.0, (int) c3.getArea());
        assertEquals(25.0, (int) c4.getArea());

    }


    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(12.0, (int) c1.getPerimeter());
        assertEquals(12.0, (int) c2.getPerimeter());
        assertEquals(48.0, (int) c3.getPerimeter());
        assertEquals(60.0, (int) c4.getPerimeter());

    }

}


