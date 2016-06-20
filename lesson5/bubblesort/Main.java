package lesson5.bubblesort;
public class Main {
    public static void main(String[] args) {
        int[] values = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        //Первый цикл начинает проверку со дна
        for (int a : values) {

            //Второй цикл берёт крайний "пузырек" и поднимает его на верх
                            //values.length возвращает 11, но итераций должно быть 10
                            //поэтому values.length - 1
            for (int i = 0; i < values.length - 1; i++) {
                int first = values[i];
                int second = values[i+1];

                //Сраниваем два числа
                if (first > second) {
                    values[i+1] = first;
                    values[i] = second;
                }
            }
        }
        //Вовыдим готовый массив на экран
        for (int b : values){
            System.out.print(b + ", ");
        }

    }
}
