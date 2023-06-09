package day15_tasks;


public class MoveFirstWord {
    public static void main(String[] args) {

        String sentence = "Learning Java is fun";

        String newSentence = sentence.substring(sentence.indexOf(" "),(sentence.length())) +" "+ (sentence.substring(0,sentence.indexOf(" ")));

        System.out.println(newSentence);
    }
}