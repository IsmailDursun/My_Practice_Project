package day32_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeList {

    public static void main(String[]args){

        Employee emp1 = new Employee("SDET",120000);
        Employee emp2 = new Employee("QA",90000);
        Employee emp3 = new Employee("Developer",130000);
        Employee emp4 = new Employee("Tester",100000);
        Employee emp5 = new Employee("Developer",95000);

        ArrayList<Employee> employeeArrayList = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp5));

        employeeArrayList.removeIf(p -> !p.empTitle.equals("SDET") && !p.empTitle.equals("Developer"));
        employeeArrayList.removeIf(p -> p.empSalary < 100000);
        System.out.println(employeeArrayList);

    }

}

class Employee {
    String empTitle;
    int empSalary;


    public Employee(String empTitle, int empSalary) {
        this.empTitle = empTitle;
        this.empSalary = empSalary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + empTitle + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
