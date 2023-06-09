package day23_tasks;

public class LastChars {
    public static void main(String[] args) {

        String [][] Arr2D = {{"James", "is", "back"},{"he", "was", "never", "gone"},{"methods", "tomorrow"}};

            for(int i=0; i< Arr2D.length; i++){
                for( int j=0; j< Arr2D[i].length; j++){
                    System.out.print(Arr2D[i][j].substring(Arr2D[i][j].length()-1));
                }
                System.out.println();
        }
    }
}
