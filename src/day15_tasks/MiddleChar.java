package day15_tasks;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        String middleChar = "";

        if(word.length()%2==0) {
            middleChar = word.substring(((word.length() / 2)-1), (word.length() / 2 )+1);
        }else{
            middleChar = word.substring((word.length() / 2), (word.length()/2)+1);
        }
        System.out.println(middleChar);
    }
}
