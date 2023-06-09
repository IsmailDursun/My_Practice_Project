package day21_tasks;

public class GradeBookTwo {
    public static void main(String[] args) {
        String [] students_ = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int [] score = {80,54,100,66,94};
        char [] grade = {'A','B','C','D'};
        char [] actualGrade = new char[students_.length];
        for (int i = 0; i < students_.length; i++) {
            if (score[i] >= 85)
                actualGrade[i] = grade[0];
            else if (score[i] >= 75)
                actualGrade[i] = grade[1];
            else if (score[i] >= 65)
                actualGrade[i] = grade[2];
            else if (score[i] < 65)
                actualGrade[i] = grade[3];
            System.out.println(students_[i] + ": " + score[i] +" = "+ actualGrade[i]);
        }

    }
}
