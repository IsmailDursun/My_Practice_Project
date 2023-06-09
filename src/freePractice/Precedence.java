package freePractice;

public class Precedence {
    public static void main(String[] args) {
//
        boolean one = ('a' != 'z') && false;
        boolean two = one || 0 == (9-10+1);
        System.out.println(two);

        double decimal = 13.142;

        int whole = decimal < 20 ? 20 : 10;
        System.out.println(whole);

    }
}
