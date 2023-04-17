package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(3, 10);
    }

    @Test
    void testGetLength() {
        assertEquals(5, rectangle.getLength());
    }

    @Test
    void testGetWidth() {
        assertEquals(10, rectangle.getWidth());
    }

    @Test
    void testGetArea() {
        assertEquals(50, rectangle.getArea());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(30, rectangle.getPerimeter());
    }
}
