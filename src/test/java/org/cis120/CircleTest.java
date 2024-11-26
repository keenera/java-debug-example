package org.cis120;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void testCircleConstructor() {
        Circle myCircle = new Circle(1, 3, 2);
        /* In JUnit equality assertions, we put expected value first
         and actual value second */
        assertEquals(2, myCircle.getRadius());
        assertEquals(1, myCircle.getX());
        assertEquals(3, myCircle.getY());
    }

    @Test
    public void testCircleAreaRadius2() {
        Circle myCircle = new Circle(1, 3, 2);
        // area = pi * r^2
        double expectedArea = Math.PI * 2 * 2; // ~12.566
        /* Note: For equality assertions with doubles (which can be imprecise),
         we pass in an additional argument delta that indicates an
         acceptable margin of error */
        assertEquals(expectedArea, myCircle.getArea(), 0.0001);
    }

    @Test
    public void testCircleAreaLargerRadius() {
        Circle myCircle = new Circle(1, 1, 4);
        double expectedArea = Math.PI * 4 * 4; // ~50.265
        assertEquals(expectedArea, myCircle.getArea(), 0.0001);
    }

    @Test
    public void testSumOfAreas() {
        Circle c1 = new Circle(10, 10, 3);
        Circle c2 = new Circle(10, 10, 4);
        Circle c3 = new Circle(10, 10, 5);
        Circle[] circles = {c1, c2, c3};
        // expected = ~175.08
        assertEquals(Math.PI * 50, Circle.getAreaSum(circles), 0.0001);
    }

    @Test
    public void testFindNonAliases() {
        // finish
    }
}
