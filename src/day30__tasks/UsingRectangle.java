package day30__tasks;

public class UsingRectangle {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5,10);
        r1.calculateArea();
        r1.calculatePerimeter();
        System.out.println(r1);

        System.out.println("-----------");

        Rectangle r2 = new Rectangle(15,25);
        r2.calculateArea();
        r2.calculatePerimeter();
        System.out.println(r2);
    }

}
