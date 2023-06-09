package replit;

public class catsdogs {
    public static void main(String[] args) {

        String str = "dogcatdog";
        int cat = 0;
        int dog = 0;
        String [] words = {"cat", "dog"};


        for (int i = 0; i < str.length()-2 ; i++) {

                if(str.substring(i, i+ words[0].length()).equals(words[0])){
                    cat++;
                }else if(str.substring(i, i+words[1].length()).equals(words[1])){
                    dog++;
                }
            }

        System.out.println(cat==dog);
        System.out.println(cat);
        System.out.println(dog);



    }
}
