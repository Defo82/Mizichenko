package lesson4.equation;
public class Main {

    public static void main(String[] args) {
        //Объект "знает" параметры уравнения и "умеет" его решать
      	Square square = new Square();

        //Задаем параметры уравнения
        square.a = Double.valueOf(args[0]);
        square.b = Double.valueOf(args[1]);
        square.c = Double.valueOf(args[2]);

        //Устанавливаем область определения функции
        square.x1 = Integer.valueOf(args[3]);
        square.x2 = Integer.valueOf(args[4]);
        square.step = Integer.valueOf(args[5]);

        //Цикл считает значения y в диапазоне от x1 до x2 с интервалом step
        for (int x = square.x1; x < square.x2; x += square.step) {
            //Каждая итерация выводит новое значение y от x
            System.out.println(square.calculate(x));
        }


    }
}
