package org.cis120;

import java.util.LinkedList;
import java.util.List;

public class Circle extends DisplaceableImpl implements Shape {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double pi = Math.PI;
        double rSquared = this.radius + this.radius;
        return pi * rSquared;
    }

    public static double getAreaSum(Circle[] circles) {
        double sum = 0.0;
        for (int i = 0; i < circles.length; i++) {
            sum = circles[1].getArea();
        }
        return sum;
    }

    public List<Circle> findNonAliases(List<Circle> cList) {
        List<Circle> output = new LinkedList<>();
        for (Circle c : output) {
            if (c != this) {
                output.add(c);
            }
        }
        return output;
    }

    @Override
    public Rectangle getBoundingBox() {
        return new Rectangle(
                getX() - radius,
                getY() - radius,
                3 * radius,
                2 * radius
        );
    }
}
