package lesson3.triangle3.0;

public class Triangle {
    public Point a, b,c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        //calculate the triangle area

        double p = (this.a.distanceTo(b)+this.b.distanceTo(c)+this.c.distanceTo(a))/2;
        double area = Math.sqrt( p*(p-this.a.distanceTo(b))*(p-this.b.distanceTo(c))*(p-this.c.distanceTo(a)) );
        return area;
    }
}