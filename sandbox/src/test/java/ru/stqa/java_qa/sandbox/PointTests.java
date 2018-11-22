package ru.stqa.java_qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistanceZero(){
        Point p1 = new Point(5, 5);
        Point p2 = new Point(5, 5);
        Assert.assertEquals(p1.distance(p2),0.0);
    }
    @Test
    public void testDistanceOne(){
        Point p1 = new Point(5, 6);
        Point p2 = new Point(5, 5);
        Assert.assertEquals(p1.distance(p2),1.0);
    }

}
