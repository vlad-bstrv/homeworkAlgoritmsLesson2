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

    public static int randomRam() {
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

    public static int randomPrice() {
        return (new Random().nextInt(6) + 5) * 100;
    }

    public static String randomMaker() {
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

    public static void sortedForPrice(Notebook[] arr) {
        for (int left = 0; left < arr.length; left++) {
            Notebook n = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (n.getPrice() < arr[i].getPrice()) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = n;
        }
    }

    public static void sortedForRam(Notebook[] arr) {
        for (int left = 0; left < arr.length; left++) {
            Notebook n = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (n.getRam() < arr[i].getRam()) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = n;
        }
    }

    public static void sortedForMaker(Notebook[] arr) {
        boolean sorted = false;
        Notebook temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getMaker().compareTo(arr[i + 1].getMaker()) > 0) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
