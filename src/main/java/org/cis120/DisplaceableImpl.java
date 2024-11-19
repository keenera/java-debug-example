package org.cis120;

public class DisplaceableImpl implements Displaceable {

    private double x;
    private double y;

    public DisplaceableImpl(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public void move(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

}
