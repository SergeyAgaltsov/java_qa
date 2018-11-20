package ru.stqa.java_qa.sandbox;

public class Distance {

    public static void main(String[] args) {

        Point p1;
        p1 = new Point(2,2);
        Point p2;
        p2 = new Point(5,6);
        Point p = new Point();
        System.out.println("Растояние между точками " + p.getDistance());
    }
}
