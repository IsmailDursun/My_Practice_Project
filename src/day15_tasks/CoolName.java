package day15_tasks;

import java.util.Scanner;

public class CoolName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        if(name.startsWith("a")||name.startsWith("z")) {
            System.out.println("Cool name");
        }else if(name.startsWith("m")){
            System.out.println("Almost cool");
        }else{
            System.out.println("Sorry, not a cool name");
        }
    }
}
