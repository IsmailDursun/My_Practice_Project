package day15_tasks;

import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String badWord = input.nextLine();

        if(badWord.contains("idiot")||badWord.contains("dumb")||badWord.contains("heck")){
            System.out.println("Message NOT sent");
        }else{
            System.out.println("Message sent");
        }
    }
}
