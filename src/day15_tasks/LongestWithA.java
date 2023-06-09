package day15_tasks;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words");
        String words = input.nextLine().toLowerCase();
        System.out.println("Enter a letter");
        String letter = input.nextLine().toLowerCase();

        String word1 = words.substring(0, words.indexOf(" "));
        String word2 = words.substring((word1.length() + 1), words.lastIndexOf(" "));
        String word3 = words.substring(words.indexOf(word2) + word2.length() + 1);
        String longest = "";

        if (word1.contains(letter) && word2.contains(letter) && word3.contains(letter)) {
            if (word1.length() > word2.length() && word1.length() > word3.length()) {
                longest = word1;
            } else if (word2.length() > word1.length() && word2.length() > word3.length()) {
                longest = word2;
            } else if (word3.length() > word1.length() && word3.length() > word2.length()) {
                longest = word3;
            }
        } else if (word1.contains(letter) && word2.contains(letter)) {
            if (word1.length() > word2.length()) {
                longest = word1;
            } else {
                longest = word2;
            }
        } else if (word1.contains(letter) && word3.contains(letter)) {
            if (word1.length() > word3.length()) {
                longest = word1;
            } else {
                longest = word3;
            }
        } else if (word2.contains(letter) && word3.contains(letter)) {
            if (word2.length() > word3.length()) {
                longest = word2;
            } else {
                longest = word3;
            }
        } else if (word1.contains(letter)) {
            longest = word1;
        } else if (word2.contains(letter)) {
            longest = word2;
        } else if (word3.contains(letter)) {
            longest = word3;

    }else{
        longest = "No word with letter: "+letter;
        }
        System.out.println(longest);
    }
}

