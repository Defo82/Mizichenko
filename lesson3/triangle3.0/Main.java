package lesson3.triangle3.0;

public class Main {
    public static void main(String[] args) {
        //Объекты
        Point a = new Point(2,2);
        Point b = new Point(4,4);
        Point c = new Point(1,4);
        Triangle triangle = new Triangle(a,b,c);
        Max m = new Max();
        CheckSide check = new CheckSide(a,b,c);

        if (check.var == false) System.out.println("Треугольник построить нельзя!");
        else {

            System.out.println("Большая сторона: " + m.max(m.max(a.distanceTo(b), b.distanceTo(c)), c.distanceTo(a)));
            System.out.println("Площадь треугольника: " + triangle.area());
        }


    }
}
