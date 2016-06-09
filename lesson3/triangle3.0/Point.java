package lesson3.triangle3.0;

public class Point {
    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point point) {
        //calculate distance between two points

        double d = Math.sqrt( Math.pow(this.x-point.x,2) + Math.pow(this.y-point.y,2) );
        return d;
    }
}
