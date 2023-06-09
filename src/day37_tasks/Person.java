package day37_tasks;

public abstract class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void hobby();
}
