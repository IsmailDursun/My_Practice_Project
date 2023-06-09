package day36_tasks;

public class Device {
    String brand;
    String model;
    double price;
    boolean wireless;

    public Device() {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.wireless = wireless;
    }


    public void useDevice(){
        System.out.println("Using the device");
    }

    @Override
    public String toString() {
        return "App{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }
}
