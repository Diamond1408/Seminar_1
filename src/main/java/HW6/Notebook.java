package HW6;

public class Notebook {private String model;
    private String brand;
    private double price;
    private String color;
    private double screenSize;
    private int ramSize;
    private int hardDiskSize;

    public Notebook(String model, String brand, double price, String color, double screenSize, int ramSize, int hardDiskSize) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.hardDiskSize = hardDiskSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(int hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public void printNotebookInfo() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Screen size: " + screenSize);
        System.out.println("RAM size: " + ramSize);
        System.out.println("Hard disk size: " + hardDiskSize);
    }
}
