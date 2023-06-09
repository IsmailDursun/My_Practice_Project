package day23_tasks;

import java.util.Arrays;

public class MultiplyArray {
    public static void main(String[] args) {

        int[][] one = {{1, 2, 3}, {2, 5, 10}, {0, 3, 20}};
        int[][] two = {{10, 4, 3}, {5, 2, 7}, {100, 20, 5}};
        int[][] resultArr = new int[3][3];

        for(int i = 0; i <= one.length-1; i++) {
            for( int j = 0; j <= one.length-1; j++)
            resultArr[i][j] = one[i][j] * two[i][j];
            }
        System.out.println(Arrays.deepToString(resultArr));
        }
    }
