package day18_tasks;

import java.util.Scanner;

public class CharactersInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        for(int i=0; i<word.length(); i++){
            int ascii = word.charAt(i);
            System.out.print(ascii);
        }

    }
}
