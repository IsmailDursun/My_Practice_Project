package day05_tasks;

public class EmployeeInfo {
    public static void main(String[]args){

        String firstName = "James";
        String lastName = "Bond;";
        char gender = 'M';
        int age = 40;
        String companyName = "MI6";
        boolean areTheFullName = true;
        String jobTitle = "Special Agent";
        int salary = 1000000;
        int numberOfPto = 15;
        boolean areTheyMarried = false;
        char suite = 'D';

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(companyName);
        System.out.println(areTheFullName);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(numberOfPto);
        System.out.println(areTheyMarried);
        System.out.println(suite);
        System.out.println("--------------------------");
        System.out.println("Employment information for "+firstName+" "+lastName+"\nGender: "+gender+"\nSpecial Agent at "
                +companyName+"\nCurrently "+age+" years old\n"+companyName+" is located in suite "+suite+"\nThis years salary comes to $"
                +salary+"\nOther details:\n\tPTO: "+numberOfPto+"\n\tFull time? "+areTheFullName+"\n\tMarried? "+areTheyMarried);



    }
}
