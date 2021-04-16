package edu.sabana.poob.shapes;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleTest {
    private static Rectangle r1;
    private static Rectangle r2;
    private static Rectangle r3;
    private static Rectangle r4;



    @BeforeAll
    public static void setUp() {
        r1 = new Rectangle();
        r2 = new Rectangle("Yellow", 2.3,5.4);
        r3 = new Rectangle(3.2, 5.2);
        r4 = new Rectangle("Blue", 5.8,6.4);

    }
    @Test
    public void shouldCalculateArea() {
        assertEquals(1 , (int) r1.getArea());
        assertEquals(12.42, (double) r2.getArea());
        assertEquals(16.64, (double) r3.getArea());
        assertEquals(37.12, (double) r4.getArea());
    }
    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(4 , (int) r1.getPerimeter());
        assertEquals(15.4, (double) r2.getPerimeter());
        assertEquals(16.8, (double) r3.getPerimeter());
        assertEquals(24.4, (double) r4.getPerimeter());
    }
    @Test
    public void shouldCalculateDiagonal() {
        assertEquals(1 , (int) r1.getDiagonal());
        assertEquals(5.869412236331676, (double) r2.getDiagonal());
        assertEquals(6.105735008989499, (double) r3.getDiagonal());
        assertEquals(8.637129152675675, (double) r4.getDiagonal());
    }
    @Test
    public void shouldPrintRectangle() {

        assertTrue(r1.toStringGeometricShape2D().contains("This is a Rectangle"));
        assertTrue(r2.toStringGeometricShape2D().contains("This is a Rectangle"));
        assertTrue(r3.toStringGeometricShape2D().contains("This is a Rectangle"));
        assertTrue(r4.toStringGeometricShape2D().contains("This is a Rectangle"));
    }


}
