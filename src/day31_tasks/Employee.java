package day31_tasks;
/*
        Tasks 1 - Employee

        Create a class called Employee in your Practice_Programming project and inside the da31_tasks package


        Task:

        - data/create instance variables::
        name, id, job title, salary

        - constructor
        - create a constructor that creates an Employee object with the name and job title
        - create a constructor that creates an Employee object with the name, id, job title, and salary

        - method/create instance methods:
        goToMeeting ()
        when this method is called print:
        $name is going to a meeting
        toString ()
        print all the employees information

        Create a class called UsingEmployee in your Practice_Programming project and inside the da31_tasks package
        Task:
        create and test the Employee objects

*/

public class Employee {
    String name;
    int id = 999;
    String jobTitle;
    long salary = 99999;

    public Employee(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int id, String jobTitle, long salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void goToMeeting(){
        System.out.println(name+" is going to a meeting");
    }
}
