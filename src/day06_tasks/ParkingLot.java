package day06_tasks;

public class ParkingLot {

    public static void main(String[]args){

        int cars = 10;
        System.out.println("There are "+cars+" in the parking lot");
        System.out.println();
        System.out.println("Two more cars drive in");

        cars++; cars++;
        System.out.println("There are "+cars+" cars in the parking lot");

        cars = cars-5;
        System.out.println("There are "+cars+" cars left in the parking lot");

    }
}
