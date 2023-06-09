package day29_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersToSum {

    public static void main(String[] args) {
        ArrayList <String> nums = new ArrayList<>();
        nums.addAll(Arrays.asList("123","34","513"));
        ArrayList <Integer> sumNums = new ArrayList<>();
        int sum=0;

        for (String each:nums) {
            for (int i = 0; i < each.length(); i++) {
                sum += Integer.parseInt(String.valueOf(each.charAt(i)));
            }
            sumNums.add(sum);
            sum = 0;
        }
        System.out.println(sumNums);
    }
}
