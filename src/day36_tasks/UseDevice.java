package day36_tasks;

public class UseDevice {
    public static void main(String[] args) {
        Tv t1 = new Tv("sony", "ar-15", 1000,true);
        Phone p1 = new Phone("Iphone");

        t1.useDevice();
        p1.usingPhone();

        System.out.println(t1);
        System.out.println(p1);
    }
}
