package day24_tasks;

public class MethodPractice3 {

    public static void main(String[] args) {

        System.out.println(positiveNegative(0));
    }

    public static String positiveNegative(int num){
        if(num>0) return "Positive";
        else if(num<0) return "Negative";
        else return "Zero";
    }
}
