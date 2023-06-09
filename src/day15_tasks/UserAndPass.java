package day15_tasks;

public class UserAndPass {
    public static void main(String[] args) {

        String user = "username";
        String password = "usernamePassword";

        if(password.length()>=5 && !password.contains(user)) {
            System.out.println("Valid password");
        }else if(password.length()<5) {
            System.out.println("Password can not be less than 5");
        }else if(password.contains(user)){
            System.out.println("Invalid password, username should not be in it");
            password = "password";
        }
        System.out.println(password);
    }
}
