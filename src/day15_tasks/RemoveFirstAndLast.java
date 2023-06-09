package day15_tasks;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "banana";

        System.out.println(word1.substring(1)+"\n"+word2.substring(0,word2.length()-1));

    }
}
