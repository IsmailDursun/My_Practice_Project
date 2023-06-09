package day30__tasks;

public class UsingCar {
    public static void main(String[] args) {
        Car car1 = new Car("RDX",2022,50,"black");
        System.out.println(car1);
        car1.drive();
        car1.isLow();
        System.out.println(car1);

        System.out.println("-------------");

        Car car2 = new Car("MDX",2023,50,"white");
        System.out.println(car2);
        car2.drive();
        car2.isLow();
        System.out.println(car2);
    }
}
