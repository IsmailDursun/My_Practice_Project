package day21_tasks;

import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 1; i<=100; i++){
            numbers[i-1] = i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
