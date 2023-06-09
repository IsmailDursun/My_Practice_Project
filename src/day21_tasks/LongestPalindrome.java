package day21_tasks;
import java.util.Arrays;
public class LongestPalindrome {
    public static void main(String[] args) {
    //  String [] wordsPalindrome = {"java", "longer word", "cvic","apple", "racear", "mo", "ann"};
        String [] wordsPalindrome = {"java", "longer word", "civic","apple", "racecar", "mom", "anna"};
        String reversed = "";
        String longestPalindrome = "";

        System.out.println(Arrays.toString(wordsPalindrome));

        for (String word : wordsPalindrome) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reversed)) {
                System.out.print(reversed+" ");
                if(reversed.length()>= longestPalindrome.length()) longestPalindrome = reversed;
            }
            reversed = "";
        }
        if(longestPalindrome.length()>0){
            System.out.println("\nlongestPalindrome: "+longestPalindrome);
        }else{
            System.out.println("No palindrome");
        }
    }
}
