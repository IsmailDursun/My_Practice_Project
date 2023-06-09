package day33_tasks;

public class useSquare {
    public static void main(String[] args) {
        Square obj1 = new Square(22);
        obj1 = new Square(4);
        System.out.println(obj1.getSide());

        Square obj2 = new Square(-3);
        System.out.println(obj2.getSide());

        Square obj3 = new Square(5);
        System.out.println(obj3.getSide());

        System.out.println(obj3.calculateArea());
        System.out.println(obj3.calculatePerimeter());

        obj1.setSide(10);
        System.out.println(obj1);
    }
}
