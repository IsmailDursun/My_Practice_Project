package day31_tasks;

public class Offer {
    String location = "Virginia";
    String company = "Google";
    long salary;
    boolean isFullTime;
    int numOfPTO;

    public Offer(String company, String location){

    }
    public Offer(String company, String location, long salary){
        this.salary = salary;
    }

    public Offer(String company, String location, long salary, boolean isFullTime, int numOfPTO){
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;

    }
    @Override
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numOfPTO=" + numOfPTO +
                '}';
    }

}
