package day22_tasks;

public class AWSZones {
    public static void main(String[] args) {

        String [] zones =  {"us-east-1","us-west-1","us-west-2","us-west-3"};
        String app = "Etsy";

        for (String zone:zones) {
            System.out.println("Deploying "+app+" to "+zone);
            System.out.println("Deployment completed for "+zone);
        }
    }
}
