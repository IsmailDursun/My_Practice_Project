package day37_tasks;

public class Tester extends Employee {


    public Tester(String name, int age, String title, int salary) {
        super(name, age, title, salary);
    }

    @Override
    public String toString() {
        return "Tester{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void hobby(){
        System.out.println("Play chess, play billiards");
    }
    @Override
    public void work(){
        System.out.println("Running test cases");
    }
}
