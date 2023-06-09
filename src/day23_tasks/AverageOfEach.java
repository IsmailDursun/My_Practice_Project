package day23_tasks;

public class AverageOfEach {
    public static void main(String[] args) {
        int [][] allNums = {{3, 4, 5, 6}, {5, 2, 6}, {10, 20, 30}};
        int average = 0;
        int averageAll = 0;

        for(int i = 0; i < allNums.length; i++){
            for(int j = 0; j < allNums[i].length; j++) {
                average += allNums[i][j];
                averageAll += allNums[i][j];
            }
            System.out.println(average/allNums[i].length);
            average = 0;
        }
        System.out.println(averageAll/allNums.length);
    }
}
