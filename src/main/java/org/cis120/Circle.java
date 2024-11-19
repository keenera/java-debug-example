package org.cis120;

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
        double rSquared = this.radius * this.radius;
        return pi * rSquared;
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
