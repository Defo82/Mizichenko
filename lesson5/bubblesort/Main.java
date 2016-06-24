package lesson5.bubblesort;
public class Main {
    public static void main(String[] args) {
        int[] values = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        BubbleSort bs = new BubbleSort();

        bs.sort(values);
        bs.watchIt(values);

    }
}
