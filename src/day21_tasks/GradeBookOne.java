package day21_tasks;

public class GradeBookOne {
    public static void main(String[] args) {
        String [] students = {"Ali", "Veli", "Deli", "Amo", "Maho"};
        int [] score = {86,75,64,53,42};
        char [] grade = {'A','B','C','D'};
        char [] actualGrade = new char[students.length];
        for (int i = 0; i < students.length; i++) {
            if (score[i] >= 85)
                actualGrade[i] = grade[0];
            else if (score[i] >= 75)
                actualGrade[i] = grade[1];
            else if (score[i] >= 65)
                actualGrade[i] = grade[2];
            else if (score[i] < 65)
                actualGrade[i] = grade[3];
            System.out.println(students[i] + ": " + score[i] +" = "+ actualGrade[i]);
        }

    }
}
