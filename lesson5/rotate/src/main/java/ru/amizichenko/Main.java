package rotate;
public class Main {
    public static void main(String[] args) {

        int[][] arr = new int[8][8];
        Rotate rotate = new Rotate();

        rotate.fillArray(arr);

        rotate.watchIt(arr);

        rotate.toRotate(arr);

        rotate.watchIt(arr);


    }
}
