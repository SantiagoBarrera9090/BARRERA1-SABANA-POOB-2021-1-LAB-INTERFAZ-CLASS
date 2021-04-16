package edu.sabana.poob.shapes;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {
    private static Triangle t1;
    private static Triangle t2;
    private static Triangle t3;


    @BeforeAll
    public static void setUp() {
        t1 = new Triangle();
        t2 = new Triangle("Blue",2.0,2.0,3.0);
        t3 = new Triangle("red", 5.0, 5.0, 7.0);

    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(0.4330127018922193, (double) t1.getArea());
        assertEquals(2.8284271247461903, (double) t2.getArea());
        assertEquals(16.345871038277526, (double) t3.getArea());

    }
    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(3, (int) t1.getPerimeter());
        assertEquals(7, (int) t2.getPerimeter());
        assertEquals(17, (int) t3.getPerimeter());

    }
    @Test
    public void isIsosceles() {
        assertEquals(true, (boolean) t1.isIsosceles());
        assertEquals(true, (boolean) t2.isIsosceles());
        assertEquals(true, (boolean) t3.isIsosceles());
    }
    @Test
    public void isEquilateral() {
        assertEquals(true, (boolean) t1.isEquilateral());
        assertEquals(true, (boolean) t2.isEquilateral());
        assertEquals(true, (boolean) t3.isEquilateral());
    }
    @Test
    public void shouldPrintTriangle() {

        assertTrue(t1.toStringGeometricShape2D().contains("This is a Triangle"));
        assertTrue(t2.toStringGeometricShape2D().contains("This is a Triangle"));
        assertTrue(t3.toStringGeometricShape2D().contains("This is a Triangle"));


    }

}


