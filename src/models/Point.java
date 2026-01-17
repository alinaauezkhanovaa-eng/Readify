package models;

public class Point {
    private double x;
    private double y;
    // constructor having both parameters
    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }
    // distance(models.Point dest) - distance from current point to the dest point
    public double distance(Point dest){
        return Math.sqrt(Math.pow(dest.x-x, 2) + Math.pow(dest.y-y, 2));
    }
    public double GetX(){
        return x;
    }
    public double GetY(){
        return y;
    }
    // toString
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
