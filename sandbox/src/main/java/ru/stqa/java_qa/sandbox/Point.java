package ru.stqa.java_qa.sandbox;

public class Point {

    public double x;
    public double y;


    public Point(double xCoord, double yCoord){
        this.x = xCoord;
        this.y = yCoord;
    }

    public double getDistance()
    {
        double dx = this.x - this.x;
        double dy = this.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
