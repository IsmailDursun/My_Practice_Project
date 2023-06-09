package day21_tasks;

public class Initials {
    public static void main(String[] args) {
        String [] names = {"James Bond", "Eve Rell", "Anna Johnson"};

        for (String name : names) {
            String firstLetter = name.substring(0, 1);
            String lastLetter = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2);
            System.out.print(firstLetter + lastLetter + " ");
        }
    }
}
