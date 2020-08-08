package com.telluriac.ch1.section12;

public class Interval1D {
    private double left;
    private double right;

    public Interval1D(double left, double right) {
        this.left = Math.min(left, right);
        this.right = Math.max(left, right);
    }

    public double left() {
        return left;
    }

    public double right() {
        return right;
    }

    public double length() {
        return right - left;
    }

    public boolean contains(final double x) {
        return (x > left) && (x < right);
    }

    public boolean intersects(final Interval1D that) {
        return !(this.right < that.left) && !(this.left > that.right);
    }

    @Override
    public String toString() {
        return String.format("Interval1D{left=%4.2f, right=%4.2f}", left, right);
    }
}
