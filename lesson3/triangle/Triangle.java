package lesson3.triangle;public class Triangle {
    public Point a, b,c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isExists () {
      /*
      Возможны два случая когда нельзя построить треугольник:
      1. Все точки лежат на одной прямой.
      2. Координаты двух точек совпадают.
      */


        if (
            //Уравнение прямой для трех точек
            (this.c.x - this.a.x) / (this.b.x - this.a.x) == (this.c.y - this.a.y) / (this.b.y - this.a.y) ||
            //Проверяем координаты
            (this.a.x == this.b.x && this.a.y == this.b.y) ||
            (this.a.x == this.c.x && this.a.y == this.c.y) ||
            (this.c.x == this.b.x && this.c.y == this.b.y)
                )return false;
        else return true;
    }


    public double area() {
        //calculate the triangle area

        double p = (this.a.distanceTo(b)+this.b.distanceTo(c)+this.c.distanceTo(a))/2;
        return Math.sqrt( p*(p-this.a.distanceTo(b))*(p-this.b.distanceTo(c))*(p-this.c.distanceTo(a)) );
    }
}
