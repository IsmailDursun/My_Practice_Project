package day36_tasks;

public class Phone extends Device{
    public Phone(String brand) {
        this.brand = brand;
    }
    public Phone (String brand, String model) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }
    public void usingPhone(){
        System.out.println("Using phone");
    }
}
