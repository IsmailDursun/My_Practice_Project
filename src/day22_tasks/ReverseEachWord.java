package day22_tasks;

public class ReverseEachWord {
    public static void main(String[] args) {

        String sentence = "It started to snow in Chicago";
        String [] wordsArr = sentence.split(" ");
        String reversed = "";
        String reversedSentence = "";

        for (String word : wordsArr){
            for (int i = word.length()-1; i >= 0 ; i--) {
                reversed += word.charAt(i);
            }
            reversedSentence += " "+reversed;
            reversed = "";
        }
        System.out.println(reversedSentence);
    }
}
