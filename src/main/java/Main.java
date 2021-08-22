public class Main {
    public static void main(String[] args) {
        Notebook[] notebooks = Notebook.initNotebook(5000);
        for (int i = 0; i < notebooks.length; i++) {
            System.out.println(notebooks[i]);
        }
    }

}
