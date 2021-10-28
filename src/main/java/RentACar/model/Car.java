package RentACar.model;

public class Car {
    private int id;
    private String brand;
    private String color;
    private int price;

    public Car() {
    }

    public Car(int id, String brand, String color, int price) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marque='" + brand + '\'' +
                ", couleur=" + color + '\'' +
                ", prix=" + price + '}';
    }
}
