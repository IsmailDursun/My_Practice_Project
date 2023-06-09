package freePractice;
import java.util.Scanner;

public class whileLoop{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();
        int count = 0;
        while(count<=num) {
            if (count % 2 == 0) {
                System.out.println(count);
            }else{
                System.out.println("Odd");
            }
            count++;
        }
    }
}