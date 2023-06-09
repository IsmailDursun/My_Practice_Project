package day33_tasks;

public class useRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        r1 = new Rectangle(15,25);
        System.out.println(r1);

        Rectangle r2 = new Rectangle(2,3);
        System.out.println(r2.getWidth());
        System.out.println(r2.getLength());

        Rectangle r3 = new Rectangle(4,8);
        System.out.println(r3.getLength());

        System.out.println(r3.calculatedArea());
        System.out.println(r3.calculatedPerimeter());
    }
}
