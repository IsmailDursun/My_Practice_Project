package freePractice;

public class Casting {
    public static void main(String[] args) {

            System.out.println("========EXPLICIT==========");
            double d = 4.55d;
            float f = 1.25f;
            int i = (int) d; // Explicit casting: double to int
            int i2 = (int) f; // Explicit casting: float to int

            System.out.println("Double Value: " + d); // Prints 4.55
            System.out.println("Double to int: " + i); // Prints 4
            System.out.println("Float value: " + f); // Prints 1.25
            System.out.println("Float to int: " + i2); // Prints 1

            long l = 100;
            short s = (short)l;
            System.out.println(s+10);

            System.out.println("========IMPLICIT==========");
            i = 1001;
            f = 105.00f;
            l = i; // Implicit casting: int to long
            d = f; // Implicit casting: float to double

            System.out.println("int Value: " + i); // Prints 1001
            System.out.println("int to long: " + l); // Prints 1001
            System.out.println("float value: " + f); // Prints 105.0
            System.out.println("float to double: " + d); // Prints 105.0}
            }
}
