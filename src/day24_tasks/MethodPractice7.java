package day24_tasks;

public class MethodPractice7 {
    public static void main(String[] args) {
        int [] nums = {3,5,7,9,11};
        sumOfArray(nums);
    }
    public static void sumOfArray(int [] arrNum){
        int sum = 0;
        for(int i = 0; i<arrNum.length-1; i++){
             sum += arrNum[i];
        }
        System.out.println(sum);
    }
}
