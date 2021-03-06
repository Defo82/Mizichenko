package bubblesort;
public class BubbleSort {

    public void sort (int[] values){
		
		/**
		Первый цикл начинает проверку со дна
		Второй цикл берёт крайний "пузырек" и поднимает его на верх
        values.length возвращает 11, но итераций должно быть 10
        поэтому values.length - 1		
		*/
		
        for (int a : values) {			
            for (int i = 0; i < values.length - 1; i++) {
                int first = values[i];
                int second = values[i+1];
                if (first > second) {
                    values[i+1] = first;
                    values[i] = second;
                }
            }
        }
    }

    public void watchIt(int[] values){
        for (int b : values){
            System.out.printf("% d",b);
        }
    }
}
