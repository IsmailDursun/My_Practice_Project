package day31_tasks;

public class UsingEmployee {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Ali", 1234, "Tester", 100000);

        System.out.println(emp1);
        emp1.goToMeeting();

        Employee emp2 = new Employee("Veli", "Engineer");
        System.out.println(emp2);
        emp2.goToMeeting();
    }
}
