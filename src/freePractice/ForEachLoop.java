package freePractice;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] num1 = {10, 20, 30, 40, 50};

        for (int each : num1) {

            System.out.println(each);
        }
        for (int i : num1) {
            System.out.println(i);
        }
    }
}