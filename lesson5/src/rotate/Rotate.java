package rotate;
public class Rotate {
	/**
	watchIt посмотреть на массив
	fillArray заполняет массив
		с переменная вне циклов чтобы массив был от 1 до 64
	toRotate поворачивает массив по часовой стрелке	
		цикл индексирует точки входа в новый радиус
        и заканчивает работу дойдя до центра
		
		спускаемся по диагонали за счет приравнивания j и i, это первый элемент
		количество итераций на 1 меньше количества элементов стороны радиуса
        d-i-1 дает число большее чем количество итераций,
        но первый элемент в цикле уже на i отступает от левого края
        остается ограничить цикл на i справа
	*/
    public void watchIt(int[][] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.printf("%2d \t",arr[i][j]);
            }
            System.out.println();
        }
    }
	
    public void fillArray (int[][] arr){

        int c = 1;

        for (int i = 0; i < arr.length; i++){
            for (int j =0; j < arr.length; j++){
                arr[i][j] = c++;
            }
        }

    }

    
    public void toRotate (int[][] arr){

        int d = arr.length; 
        System.out.println("this is langs "+d);

        for (int i = 0; i < d/2; i++) {
            for (int j = i; j < d-i-1; j++) {                
                int tmp = 0;
                tmp = arr[i][j];
                arr[i][j] = arr[d-j-1][i];
                            arr[d-j-1][i] = arr[d-i-1][d-j-1];
                                            arr[d-i-1][d-j-1] = arr[j][d-i-1];
                                                                arr[j][d-i-1] = tmp;


            }
        }

    }
}
