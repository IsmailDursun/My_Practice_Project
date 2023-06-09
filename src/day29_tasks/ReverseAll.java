package day29_tasks;

import java.util.ArrayList;
import java.util.Arrays;


public class ReverseAll {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("ted", "talk", "learn"));
        System.out.println(words);
        ArrayList<String> wordReversed = new ArrayList<>();
        String reversed = "";
        for (String each: words) {

            for (int i = each.length()-1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            wordReversed.add(reversed);
            reversed = "";
        }
        System.out.println(wordReversed);

    }
}