package day22_tasks;

public class MultipleWords {
    public static void main(String[] args) {

        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] wordArr = words.split(", ");

        for (String word : wordArr) {
            if(word.contains(" ")) {
                System.out.println(word);
            }
        }
    }
}
