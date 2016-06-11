package lesson4.equation;
public class Square {

     public double a, b, c;
     public int x1, x2, step;


     public float calculate(int x) {
        return (float) (this.a * Math.pow(x, 2) + this.b * x + this.c);
    }




}