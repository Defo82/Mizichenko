packege lesson5.duplicate;
public class Main {
    public static void main(String[] args) {

        RD rd = new RD();

        String[] arr = {"слово0",
                        "слово1",
                        "слово2",
                        "слово3",
                        "слово1",
                        "слово2",
                        "слово4",
                        "слово5",
                        "слово6"};

        for (String a : arr) {
            System.out.println(a+"\t");
        }


        rd.removeDuplicate(arr);


        System.out.println("\n"+"");
        for (String a : arr) {
            System.out.println(a+"\t");
        }






    }
}