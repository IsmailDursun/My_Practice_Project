package day35_tasks;

public class AllClassesDiscord {
    public static void main(String[] args) {

        Student s1 = new Student("Ali", 15);
        Admin a1 = new Admin("Veli", 25);
        DiscordUser d1 = new DiscordUser("Newbie","Mike", 65);

        s1.sendMessage();
        a1.createChannel();
        System.out.println(d1);
        System.out.println(a1);
        System.out.println(s1);
    }
}
