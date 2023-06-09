package day24_tasks;
import java.util.Arrays;

public class MethodPractice9 {
    public static void main(String[] args) {

        int [] numArr = {1, 2, 3, 5};
        evenOddArr(numArr);

    }
    public static void evenOddArr(int numArr[]){
        int evenCount=0;
        int oddCount=0;
        for (int each : numArr) {
            if (each % 2 == 0) evenCount++;
            else oddCount++;
        }
        int [] resultArr = {evenCount, oddCount};
        System.out.println(Arrays.toString(resultArr));
    }

}
