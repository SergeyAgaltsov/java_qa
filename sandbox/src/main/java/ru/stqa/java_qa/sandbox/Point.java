package ru.stqa.java_qa.sandbox;

public class Point {

    public double x;
    public double y;

    public Point(double xPosition, double yPosition) {
        this.x = xPosition;
        this.y = yPosition;
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow(x - p2.x, 2) + Math.pow(y - p2.y, 2));
    }
}


