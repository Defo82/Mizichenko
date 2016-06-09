/*
    Возможны два случая когда нельзя построить треугольник:
    1. Все точки лежат на одной прямой.
    2. Координаты двух точек совпадают.
*/

package lesson3.triangle3.0;

public class CheckSide {

    public Point a, b,c;

    public CheckSide (Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean var = true;

    public void checkLine() {
        //Уравнение прямой для трех точек
        if ((this.c.x - this.a.x) / (this.b.x - this.a.x) == (this.c.y - this.a.y) / (this.b.y - this.a.y)) {
            this.var = false;
        }
    }

    public void checkXY() {
        //Проверяем координаты
        this.var = (this.a.x == this.b.x && this.a.y == this.b.y)?false:true;
        this.var = (this.a.x == this.c.x && this.a.y == this.c.y)?false:true;
        this.var = (this.c.x == this.b.x && this.c.y == this.b.y)?false:true;
    }
}
