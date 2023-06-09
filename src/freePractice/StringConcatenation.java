package freePractice;

public class StringConcatenation {
    public static void main(String[] args) {
        String ta = "A";
        ta = ta + "B";
        System.out.println(ta);
        String tb = "C";
        ta = ta + tb;
        System.out.println(ta);
        ta.replace('C','D');
        System.out.println(ta);
        ta = ta.replace('C','D');
        System.out.println(ta);
    }
}
