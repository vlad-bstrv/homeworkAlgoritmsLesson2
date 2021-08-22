import java.util.Random;

public class Notebook {
    private int id;
    private String maker;
    private int price;
    private int ram;

    public Notebook(int id, String maker, int price, int ram) {
        this.id = id;
        this.maker = maker;
        this.price = price;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", maker='" + maker + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }

    public static Notebook[] initNotebook(int count) {
        Notebook[] arr = new Notebook[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Notebook(i, randomMaker(), randomPrice(), randomRam());
        }
        return arr;
    }

    private static int randomRam() {
        Random random = new Random();
        int ram = 0;
        switch (random.nextInt(4)) {
            case 0:
                ram = 4;
                break;
            case 1:
                ram = 8;
                break;
            case 2:
                ram = 12;
                break;
            case 3:
                ram = 16;
                break;
        }
        return ram;
    }

    private static int randomPrice() {
        return (new Random().nextInt(6) + 5) * 100;
    }

    private static String randomMaker() {
        Random random = new Random();
        String nameMaker = "";
        switch (random.nextInt(5)) {
            case 0:
                nameMaker = "Acer";
                break;
            case 1:
                nameMaker = "Lenovo";
                break;
            case 2:
                nameMaker = "Asus";
                break;                
            case 3:
                nameMaker = "Apple";
                break;
            case 4:
                nameMaker = "Xiaomi";
                break;
        }
        return nameMaker;
    }
}
