package org.cis120;

public class Rectangle extends DisplaceableImpl implements Shape {
    private double w, h;

    public Rectangle(double x, double y, double w, double h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }

    @Override
    public double getArea() {
        return w * h;
    }

    @Override
    public Rectangle getBoundingBox() {
        return new Rectangle(getX(), getY(), this.w, this.h);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Rectangle)) {
            return false;
        }

        Rectangle r = (Rectangle) o;

        return this.h == r.h
                && this.w == r.w
                && this.getX() == r.getX()
                && this.getY() == r.getY();
    }
}
