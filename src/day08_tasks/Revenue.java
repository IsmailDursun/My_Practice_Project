package day08_tasks;
import java.util.Scanner;
public class Revenue {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price");
        double price = input.nextDouble();
        System.out.println("Enter the quantity");
        double quantity = input.nextDouble();
        double revenue = price * quantity;
        System.out.println("Revenue: $"+revenue);
    }
}
