package day33_tasks;

public class Computer<hasScreen> {

double price;
String brand;
String color;

static boolean hasScreen;
static boolean hasBattery;
static boolean hasMemory;

static{
    System.out.println("Printing static block");
    hasScreen = true;
    hasBattery = true;
    hasMemory = true;
}
    public Computer(double price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

}
