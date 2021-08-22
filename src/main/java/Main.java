import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Notebook[] notebooks = Notebook.initNotebook(100);
//        for (int i = 0; i < notebooks.length; i++) {
//            System.out.println(notebooks[i]);
//        }

        Notebook.sortedForMaker(notebooks);
        for (int i = 0; i < notebooks.length; i++) {
            System.out.println(notebooks[i]);
        }
    }

}
