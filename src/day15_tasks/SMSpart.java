package day15_tasks;

public class SMSpart {
    public static void main(String[] args) {

        String message = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        String sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        String number = message.substring(message.indexOf("[")+1,message.indexOf("]"));
        String actualMessage = message.substring(message.indexOf("{")+1, message.indexOf("}"));

        System.out.println("Sender: "+sender+"\nNumber: "+number+"\nMessage: "+actualMessage);
    }
}
