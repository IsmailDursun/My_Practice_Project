package day36_tasks;

public class Tv extends Device{

    public Tv(String brand, String model, double price, boolean wireless) {
        super();
    }

    @Override
    public void useDevice() {
        System.out.println("Using TV");
    }
}
