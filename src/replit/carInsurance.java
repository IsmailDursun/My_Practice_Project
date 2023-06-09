package replit;
import java.util.*;

public class carInsurance {
    public static void main(String[] args) {
        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String accidents="";
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String driverLicense = scan.next();
        if(driverLicense.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        String zipCode = scan.next();
        if(zipCode.equalsIgnoreCase("20910") || zipCode.equalsIgnoreCase("20740")){
            premium += 60;
        }else if(zipCode.equalsIgnoreCase("22102") || zipCode.equalsIgnoreCase("22103")){
            premium += 30;
        }else{
            premium += 50;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if(vehicleOwnership.equalsIgnoreCase("owned")){
            premium += 10;
        }else{
            premium += 20;
        }
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if(vehicleUsage.equalsIgnoreCase("business")){
            premium += 50;
        }else if(vehicleUsage.equalsIgnoreCase("pleasure")){
            premium += 10;
        }else if(vehicleUsage.equalsIgnoreCase("commute")){
            premium += 20;
        }
        System.out.println("Days Driven To Work And/Or School");
        daysDrivenToWorkOrSchool = scan.nextInt();
        premium += daysDrivenToWorkOrSchool*5;
        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool = scan.nextInt();
        premium += milesToWorkOrSchool;
        System.out.println("How old are you?");
        int age = scan.nextInt();
            if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);
            }else if(age>=16&&age<18){
            premium *= 20;
            }else if(age>=18&&age<=21){
            premium *= 6;
            }else if(age>21&&age<25){
            premium *= 2;
            }
        System.out.println("How many years you've been driving?");
        int experience = scan.nextInt();
            if(experience==0 && age-experience<16){
            System.out.println("Invalid data!");
            System.exit(0);
            }else{
            premium -= experience*5;
            }
        System.out.println("Have you had any accidents in the last 5 years?");
        accidents = scan.next();
            if(accidents.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium += accidentsAmount * (premium/5);
            }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
            if(continuousInsurance.equalsIgnoreCase("no")){
            premium *= 2;
            }
        System.out.println("What is the highest level of education you have completed?");
        education = scan.next();
            if(education.equalsIgnoreCase("phd")||education.equalsIgnoreCase("bachelors")||education.equalsIgnoreCase("masters")){
                premium -= premium / 20;
            }else if(education.equalsIgnoreCase("doctors")){
                premium -= premium / 10;
            }else{
                premium += premium / 20;
            }
        referenceNumber = (name.substring(0,2)+age+name.charAt(name.length()-2)+ name.charAt(name.length()-1)+zipCode+education).toUpperCase();

        System.out.println(name+", here's your quote!\nStart Your Policy Today For: $"+premium+"\nReference number: "+referenceNumber);
    }
}