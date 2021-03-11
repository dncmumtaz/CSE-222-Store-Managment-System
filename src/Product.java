import java.util.Scanner;

public abstract class Product {
    protected Product() {
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    String model;
    String color;

    public  Product(String model, String color) {
        this.model = model;
        this.color = color;
    }

}