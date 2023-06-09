package day08_tasks;
import java.util.Scanner;
public class PlaceOrder {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name:");
        String product = input.nextLine();
        System.out.println("Enter the price:");
        double price = input.nextDouble();
        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();
        System.out.println("Enter your full name:");
        String name = input.next();
        System.out.println(name+", your order for "+quantity+" "+product+
                " has been placed. Your total is $"+(price*quantity));
    }
}
