package day18_tasks;

public class CountUpperLowerNumbers {
    public static void main(String[] args) {
        int lowerCase=0,upperCase=0,number=0;
        String word = "2juMp41EEkd4s4";

        for(int i = 0; i<word.length(); i++){
            if((word.charAt(i))>=(int)'a'&& (word.charAt(i)<=(int)'z')){
                ++lowerCase;

            }else if((word.charAt(i))>=(int)'A'&& (word.charAt(i)<=(int)'Z')){
                ++upperCase;
            }else if((word.charAt(i))>=(int)'0'&& (word.charAt(i)<=(int)'9')){
                ++number;
            }
        }
        System.out.println("lowerCase: "+lowerCase+"\nupperCase: "+upperCase+"\nnumbers: "+number);
    }
}
