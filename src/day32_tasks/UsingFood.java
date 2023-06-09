package day32_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingFood {

    public static void main(String[] args) {

        Food spinach = new Food("Spinach");
        Food apple = new Food("Apple",5);
        Food orange = new Food("Orange",10,4.00);
        Food pear = new Food("Alabalik", 5, 2.00);

        ArrayList<Food> foodArr = new ArrayList<>(Arrays.asList(spinach,apple,orange,pear));

        for (Food each : foodArr){
            each.calculatePrice();
            if((each.name.charAt(0)+"").equalsIgnoreCase("a")){
                System.out.println(each.name+" starts with A");
            }
            if(each.totalPrice>20){
                System.out.println(each.name+"'s total price is over 20");
            }
        }
    }
}
