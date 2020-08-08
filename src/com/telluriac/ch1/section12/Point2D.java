package com.telluriac.ch1.section12;

public class Point2D {

    private double x;
    private double y;

    Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double x() {
        return x;
    }

    double y() {
        return y;
    }

    double r() {
        return Math.sqrt(x * x + y * y);
    }

    double theta() {
        return Math.atan2(y, x);
    }

    double distanceTo(Point2D that) {
        final Point2D d = new Point2D(this.x - that.x, this.y - that.y);

        return d.r();
    }

    static double distance(final Point2D p1, final Point2D p2) {
        return p1.distanceTo(p2);
    }

    void draw() {
        // TBIMplemented
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
