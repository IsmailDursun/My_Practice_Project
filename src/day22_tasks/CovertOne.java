package day22_tasks;

import java.util.Scanner;

public class CovertOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();

        char [] nameChar = name.toCharArray();
        System.out.println(""+nameChar[0]+nameChar[nameChar.length-1]);
    }
}
