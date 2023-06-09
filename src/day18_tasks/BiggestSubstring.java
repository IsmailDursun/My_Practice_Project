package day18_tasks;

public class BiggestSubstring {
    public static void main(String[] args) {

        String letter = "aaabbbcccccddddee";
        String biggest = "";

        for (int i = 0; i < letter.length(); i++) {
            int j = i + 1;
            while (j < letter.length() && letter.charAt(j) == letter.charAt(i)) {
                j++;
            }
            if (j-i> biggest.length()) {
                biggest=letter.substring(i,j);
            }
        }
        System.out.println(biggest);
    }
    }

