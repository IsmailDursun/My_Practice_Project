package day24_tasks;

import java.util.Arrays;

public class MethodPractice8 {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5};
        int num = 3;
        System.out.println(containsInt(numArr, num));
    }

    public static boolean containsInt(int[] numArr, int num) {

        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {

            if (numArr[i] == num) {
                return true;
            }
        }
        return false;
        }

    }
