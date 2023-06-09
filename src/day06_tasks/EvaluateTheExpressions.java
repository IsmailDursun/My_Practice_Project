package day06_tasks;

public class EvaluateTheExpressions {

    public static void main(String[] args) {

        int x = 2+3*2/1;
        System.out.println(x);

        int y = (2+3)*2;
        System.out.println(y);

        int w = 78/2*2+3-5%5;
        System.out.println(w);

        int i = 8+2+3+5-2-1-0+1*2;
        System.out.println(i);

        int a = 8;
        int b = a--;
        System.out.println(a +" "+ b);

        a = 1;
        b = -a-- + a++ / -a-- * --a;
        System.out.println(a +" "+ b);

        int A = 50;
        int B = --A + A++ + A-- + A++;
        System.out.println(A + " " + B);

        int X = 4;
        int Y = X * 4 - X++;
        System.out.println(X + " " + Y);

        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        System.out.println(t + " " + p);

    }
}
