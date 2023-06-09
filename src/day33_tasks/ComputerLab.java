package day33_tasks;

public class ComputerLab {

    public static void main(String[] args) {
        Computer c1 = new Computer(1000, "Apple", "Red");
        System.out.println(c1.color);

        Computer c2 = new Computer(1200, "HP", "Black");
        System.out.println(c2.color);

        System.out.println(Computer.hasMemory);

        c1.hasMemory = false;

        System.out.println(c1.hasMemory);
        System.out.println(Computer.hasMemory);

        System.out.println(c1.color+" "+c2.price);
    }
}
