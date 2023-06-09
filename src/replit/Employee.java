package replit;

public class Employee {

    public static void main (String[]args){

        String firstName = "Noah";
        String lastName = "Smith";
        String companyName = "Apple";
        int salary = 200_000;
        short startDay = 10;
        short startMonth = 1;
        short startYear = 2022;
        boolean fullTime = true;
        String jobTitle = "SDET";
        String officeAddress = "One Apple Park Way, Cupertino, CA 95014";

        String fullName = firstName+" "+lastName;
        String fullStartDate = startMonth+"/"+startDay+"/"+startYear;
        String email = firstName+startDay+"@"+companyName+".com";
        int salaryAfterTwoYears = salary*115/100;

        System.out.println("Employee Information\nWe have "+fullName+" joining "+companyName);
        System.out.println(firstName+" will start on "+fullStartDate+" as full time: "+fullTime);
        System.out.println(firstName+" here is some information about your employment");
        System.out.println("Your email is "+email);
        System.out.println("Your base salary is $"+(int)salary+" and after 2 years it will be $"+salaryAfterTwoYears);
        System.out.println("Welcome aboard, see you at "+officeAddress);
    }
}
