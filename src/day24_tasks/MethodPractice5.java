package day24_tasks;
import java.lang.*;
public class MethodPractice5 {
    public static void main(String[] args) {

        diagonalPrint("HelloWorld");

    }
    public static void diagonalPrint(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }
}
