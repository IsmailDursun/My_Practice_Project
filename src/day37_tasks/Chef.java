package day37_tasks;

public class Chef extends Employee {

    public Chef(String name, int age, String title, int salary) {
        super(name, age, title, salary);
    }

    @Override
    public String toString() {
        return "Chef{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void work() {
        System.out.println("Trying new food");
    }

    @Override
    public void hobby() {
        System.out.println("Cooking a 3 course meal");
    }
}
