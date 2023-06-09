package freePractice;

public class Fibonnacci {
    public static void main(String[] args) {

        System.out.println("========Fibonnaci========");

        int num1 = 0, num2 = 1;

        for(int i =0; i<=10;++i){
            System.out.print(num1+" ");
        int total = num1+num2;
        num1 = num2;
        num2 = total;


        }
    }
}
