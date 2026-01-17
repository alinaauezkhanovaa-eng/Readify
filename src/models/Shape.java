package models;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<models.Point>)
    private ArrayList<Point> points=new ArrayList<>();
    // addPoint(models.Point) - adds to the container
    public void  addPoint(Point p){
        points.add(p);
    }
    // calculatePerimeter()
    public double calculatePerimeter() {
        double sum = 0;
        for (int i = 0; i < points.size(); i++) {
            sum += lengthside(i);
        }
        return sum;
    }
    // getAverageSide()
    public double avg() {
        if (points.isEmpty()) return 0;
        return calculatePerimeter() / points.size();
    }
    // getLongestSide()
    public double getLongest() {
        if (points.isEmpty()) return 0;
        double max = 0;
        for (int i = 0; i < points.size(); i++) {
            double side = lengthside(i);
            if (side > max) max = side;
        }
        return max;
    }
    private double lengthside(int i) {
        Point current = points.get(i);
        Point next = points.get((i + 1) % points.size());
        return current.distance(next);
    }
}
