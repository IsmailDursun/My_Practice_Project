package replit;
import java.util.Scanner;
public class JavaPython {

        public static void main(String[] args) {

            String sentence = "java, javascript, python, c#, c++, rust, ruby python, swift";
            int java=0;
            int python=0;
            String [] words = {"java","python"};

            for(String each:words){

                for(int i = 0; i<sentence.length()-each.length(); i++){

                    if(sentence.substring(i, i+each.length()).equals(words[0])){
                        java++;
                    }else if(sentence.substring(i, i+each.length()).equals(words[1])){
                        python++;
                    }
                }
            }
            System.out.println(java == python);
            System.out.println(java);
            System.out.println(python);

        }
    }
