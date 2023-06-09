package day15_tasks;

public class ReplaceProgram {
    public static void main(String[] args) {

        String message = "Java is fun overtime";
        int number = 3;
        if(number == 1){
            message = message.replace('a','e');
        }else if(number == 2) {
            message = message.replace('s', 'r');
        }else if(number == 3){
            message = message.replace('o','z');
        }else{
            message = "Invalid number";
        }
        System.out.println(message);
    }
}
