package day15_tasks;

public class FixName {
    public static void main(String[] args) {

        String firstName = "jAmEs";
        String lastName = "bOnD";

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();

        System.out.println("Your full name: "+firstName+" "+lastName);
    }
}
