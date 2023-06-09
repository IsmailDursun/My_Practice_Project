package day29_tasks;
import java.util.*;
public class RemoveBadPairs {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        ArrayList <Integer> goodNums = new ArrayList<>();

            for(int i = 0; i < nums.size(); i+=2){
                if(nums.get(i)<nums.get(i+1)){
                    goodNums.addAll(Arrays.asList(nums.get(i), nums.get(i+1)));
                }
            }
        System.out.println(goodNums);
    }
}
