package day32_tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class UsingHobby {
    public static void main(String[] args) {
        Hobby h1 = new Hobby("painting");
        System.out.println(h1);
        h1.doit();
        Hobby h2 = new Hobby("hiking", 500);
        System.out.println(h2);
        h2.doit();
        Hobby h3 = new Hobby("boxing",1000,true,true);
        System.out.println(h3);
        h3.doit();
        ArrayList <Hobby> hobbyArrayList = new ArrayList<>(Arrays.asList(h1,h2,h3));
        System.out.println(hobbyArrayList);
        System.out.println("====================");
        ArrayList <Hobby> noOutdoorList = new ArrayList<>(List.copyOf(hobbyArrayList));
        ArrayList <Hobby> noRequiresOthers = new ArrayList<>(List.copyOf(hobbyArrayList));
        ArrayList <Hobby> noMoreCost = new ArrayList<>(List.copyOf(hobbyArrayList));
        System.out.println("===============");
        for (Hobby each:hobbyArrayList){
            each.doit();
        }
        noOutdoorList.removeIf(each -> each.isOutdoors);
        System.out.println(noOutdoorList);
        noRequiresOthers.removeIf(each -> each.requiresOthers);
        System.out.println(noRequiresOthers);
        noMoreCost.removeIf(each -> each.annualCost>500);
        System.out.println(noMoreCost);
    }
}
