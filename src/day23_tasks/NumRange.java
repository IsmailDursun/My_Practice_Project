package day23_tasks;

import java.util.Arrays;

public class NumRange {
    public static void main(String[] args) {

        int [][] tenTen = new int [10][10];
        int i = 1;

        for(int j = 0; j < tenTen.length; j++) {
            for (int k = 0; k < tenTen[j].length; k++) {
                tenTen[j][k] = i;
                i++;
            }
        }
        System.out.println(Arrays.deepToString(tenTen));
    }
}
