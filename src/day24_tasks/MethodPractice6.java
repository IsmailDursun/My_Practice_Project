package day24_tasks;

public class MethodPractice6 {
    public static void main(String[] args) {
        isPalindrome("racecar");
    }
    public static void isPalindrome(String str) {
        String reversed="";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (str.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
            }
        }
}
