package day24_tasks;

public class MethodPractice4 {
    public static void main(String[] args) {
        System.out.println(angles(90,60,90));
    }

    public static String angles(int num1,int num2,int num3){
        if(num1+num2+num3 == 180) return "This is a Triangle";
        else if(num1+num2+num3 == 360) return "This is a circle";
        else return "This is not an angle";
    }
}
