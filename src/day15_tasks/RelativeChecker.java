package day15_tasks;

public class RelativeChecker {
    public static void main(String[] args) {
        String name1 = "Ali Yilmaz";
        String name2 = "Veli Yilmaz";

        if(name1.substring(name1.indexOf(" ")).equals(name2.substring(name2.indexOf(" ")))){
            System.out.println("Related");
        }else{
            System.out.println("Not related");
        }
    }
}
