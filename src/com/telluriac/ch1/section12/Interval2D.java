package com.telluriac.ch1.section12;

public class Interval2D {
    private Interval1D x;
    private Interval1D y;

    public Interval2D(Interval1D x, Interval1D y) {
        this.x = x;
        this.y = y;
    }

    double area() {
        return x.length() * y.length();
    }

    boolean contains(Point2D p) {
        return x.contains(p.x()) && y.contains(p.y());
    }

    boolean intersects(Interval2D that) {
        return this.x.intersects(that.x) && this.y.intersects(that.y);
    }

    void draw() {
    }

    @Override
    public String toString() {
        return "Interval2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
