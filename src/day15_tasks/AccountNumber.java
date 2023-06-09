package day15_tasks;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        String accountNumber = input.nextLine();

        if (accountNumber.startsWith("2") || accountNumber.startsWith("5")) {

            if (accountNumber.startsWith("2") && accountNumber.length() == 7) {
                System.out.println("Valid 7-digit account number");
            } else if (accountNumber.startsWith("2") && accountNumber.length() != 7) {
                System.out.println("Invalid 7-digit account number");
            } else if (accountNumber.startsWith("5") && accountNumber.length() == 10) {
                System.out.println("Valid 10-digit account number");
            } else if (accountNumber.length() != 10) {
                System.out.println("Invalid 10-digit account number");
            }

        }else{
            System.out.println("Invalid account number");
        }
    }
}