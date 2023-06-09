package day23_tasks;
public class BiggestDiagonal {
    public static void main(String[] args) {
        int[][]nums = {{3,5,1},{1, 6, 10}, {5, 21, 10}};

        int diag1 = nums[0][0]+nums[1][1]+nums[2][2];
        int diag2 = nums[0][2]+nums[1][1]+nums[2][0];

        System.out.println((diag1 > diag2) ? nums[0][0] + ", " + nums[1][1] + ", " + nums[2][2] :
                           nums[0][2] + ", " + nums[1][1] + ", " + nums[2][0]);
    }
}
