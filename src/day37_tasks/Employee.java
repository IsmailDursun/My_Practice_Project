package day37_tasks;

public abstract class Employee extends Person{
    String title;
    int salary;
    public Employee(String name, int age, String title, int salary){
        super(name, age);
        this.salary = salary;
        this.title = title;
    }

    @Override
    public void hobby() {
    }
    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
