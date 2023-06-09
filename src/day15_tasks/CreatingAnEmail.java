package day15_tasks;

import java.util.Scanner;

public class CreatingAnEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string1 = input.nextLine();
        String string2 = input.nextLine();

        if(string1.length() >= 6 && string2.length() >= 6){
            System.out.println(string1.substring(0,4) + string2.substring(string2.length()-3)+ "@loopcamp.io");

        }else{
            System.out.println("Invalid data");
        }
    }
}
