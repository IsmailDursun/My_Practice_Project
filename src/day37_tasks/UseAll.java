package day37_tasks;

public class UseAll {
    public static void main(String[] args) {

        Employee T1 = new Tester("Ali",40, "tester", 100000);
        System.out.println(T1.name);
        T1.hobby();
        T1.work();
        System.out.println(T1);

        System.out.println("========================");

        Employee C1 = new Chef("Veli", 38, "chef", 65000);
        System.out.println(C1.name);
        C1.hobby();
        C1.work();
        System.out.println(C1);



    }
}
