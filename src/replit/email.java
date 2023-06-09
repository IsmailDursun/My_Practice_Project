package replit;

import java.util.Locale;

public class email {
    public static void main(String[] args) {
        String email = "jeff_bezos@amazon.us";
    /*
    Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
    */
        System.out.println("First name: " + email.substring(0,1).toUpperCase() + email.substring(1,email.indexOf("_")));
        System.out.println("Last name: " + email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@")));
        System.out.println("Domain: " + email.substring(email.indexOf("@")+1,email.indexOf("@")+2).toUpperCase()+email.substring((email.indexOf("@")+2),email.indexOf(".")));

    }
}