import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Notebook[] notebooks = new Notebook[5000];
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = initNotebook(i);
        }

        Notebook.sortedForPrice(notebooks);

        Notebook.sortedForRam(notebooks);

        Notebook.sortedForMaker(notebooks);

    }

    public static Notebook initNotebook(int id) {
        return new Notebook(id, Notebook.randomMaker(), Notebook.randomPrice(), Notebook.randomRam());
    }

}
