import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Notebook[] notebooks = new Notebook[5000];
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = initNotebook(i);
        }

        Notebook.sortedForPrice(notebooks);
        for (int i = 0; i < notebooks.length - 1; i++) {
            if(notebooks[i].getPrice() == notebooks[i+1].getPrice()){
                Notebook.sortedForRam(notebooks);
                break;
            }
            
        }
        for (int i = 0; i < notebooks.length - 1; i++) {
            if(notebooks[i].getRam() == notebooks[i+1].getRam()){
                Notebook.sortedForMaker(notebooks);
                break;
            }

        }


    }

    public static Notebook initNotebook(int id) {
        return new Notebook(id, Notebook.randomMaker(), Notebook.randomPrice(), Notebook.randomRam());
    }

}
