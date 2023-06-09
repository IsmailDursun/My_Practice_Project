package day08_tasks;
import java.util.Scanner;
public class RateCalculator {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a salary");
        double salary = input.nextDouble();
        System.out.println("Enter weekly hours");
        double weeklyHours = input.nextDouble();
        double hourlyRate = salary / (weeklyHours*52);
        System.out.println("Hourly rate of the employee: $"+hourlyRate);

    }
}
