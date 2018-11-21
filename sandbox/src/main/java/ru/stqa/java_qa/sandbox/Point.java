package ru.stqa.java_qa.sandbox;

public class Point {

    private double x;
    private double y;

    public Point(double xPosition, double yPosition) {
        x = xPosition;
        y = yPosition;
    }

    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }
}


