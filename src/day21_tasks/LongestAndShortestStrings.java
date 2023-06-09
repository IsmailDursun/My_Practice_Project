package day21_tasks;

public class LongestAndShortestStrings {
    public static void main(String[] args) {
        String [] words = {"Shortest", "and", "Longest", "words", "from", "String", "array"};
        String shortest = words[0];
        String longest = words[0];
        for (String s : words) {
            if (s.length() <= shortest.length()) {
                shortest = s;
            }
            if (s.length() >= longest.length()) {
                longest = s;
            }
        }
        System.out.println("Longest: "+longest+"\nShortest: "+shortest);
    }
}
