package freePractice;

import java.util.Arrays;

public class addBeginning {
    public static int [] addBegining (int [] arr, int num) {  // {1, 2, 3, 4, 5}  --- >   {_, 1, 2, 3, 4, 5}

        int [] arrTwo = new int[arr.length+1];  //  { _, _, _, _, _, _ }

        arrTwo [0] = num;


        for (int i = 1; i < arrTwo.length;  i++) {
            arrTwo[i] = arr[i-1];
        }

        return arrTwo;

    }


    public static void main(String[] args) {

        int []  arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(   addBegining(arr, 9)     ));

    }
}
