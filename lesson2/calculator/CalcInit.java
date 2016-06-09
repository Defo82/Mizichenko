package lesson2.calculator;

public class CalcInit {
    public static void main(String[] args) {
       Calculator calc = new Calculator();

        calc.add(2,2);
        System.out.println(calc.result);

        calc.substruct(2,2);
        System.out.println(calc.result);

        calc.div(2,2);
        System.out.println(calc.result);

        calc.multiple(2,2);
        System.out.println(calc.result);
    }
}
