package freePractice;

public class Concatenation {
    public static void main(String[] args) {
        int check = 132;
        String str = "";

        if (check % 2 == 0){
            str += check;
//            if(check % 5 == 0){
//                str += "132";
//            }else{
//                str = "500";
//            }
//        }else{
//            str += "123";
        }
        System.out.println(str);
        str += 1;
        System.out.println(str);
    }
}
