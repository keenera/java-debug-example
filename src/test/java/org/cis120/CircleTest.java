package org.cis120;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void testCircleConstructor() {
        Circle myCircle = new Circle(1, 3, 2);
        // In JUnit equality assertions, we put expected value first
        // and actual value second
        assertEquals(2, myCircle.getRadius());
        assertEquals(1, myCircle.getX());
        assertEquals(3, myCircle.getY());
    }
}
