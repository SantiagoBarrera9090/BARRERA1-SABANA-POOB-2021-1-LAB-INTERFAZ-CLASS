package edu.sabana.poob.shapes;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    private static Square s1;
    private static Square s2;
    private static Square s3;
    private static Square s4;

    @BeforeAll
    public static void setUp() {
        s1 = new Square();
        s2 = new Square("Yellow");
        s3 = new Square("Blue", 5.2);
        s4 = new Square("Black", 6.4);

    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(1, (int) s1.getArea());
        assertEquals(1.0, (double) s2.getArea());
        assertEquals(27.040000000000003, (double) s3.getArea());
        assertEquals(40.96000000000001, (double) s4.getArea());
    }
    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(4 , (int) s1.getPerimeter());
        assertEquals(4.0, (double) s2.getPerimeter());
        assertEquals(20.8, (double) s3.getPerimeter());
        assertEquals(25.6, (double) s4.getPerimeter());
    }
    @Test
    public void shouldCalculateDiagonal() {
        assertEquals(2 , (int) s1.getDiagonal());
        assertEquals(2.0, (double) s2.getDiagonal());
        assertEquals(54.080000000000005, (double) s3.getDiagonal());
        assertEquals(81.92000000000002, (double) s4.getDiagonal());
    }
    @Test
    public void shouldPrintSquare() {

        assertEquals("This is a Square with color NONE and Diagonal 2.0", s1.toString());
        assertEquals("This is a Square with color Yellow and Diagonal 2.0", s2.toString());
        assertEquals("This is a Square with color Blue and Diagonal 54.080000000000005", s3.toString());
        assertEquals("This is a Square with color Black and Diagonal 81.92000000000002", s4.toString());
    }
}