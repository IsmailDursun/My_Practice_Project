package day35_tasks;

public class Student extends DiscordUser{
    public Student(String name, int id) {
        super("Student", name, id);
    }
    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }
}
