package day32_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferList {

    public static void main(String[] args) {

    Offer offer1 = new Offer("Google", 150_000, true, "SDET", true);
    Offer offer2 = new Offer("Apple", 120_000, false, "QA", true);
    Offer offer3 = new Offer("ManTech", 95000, true, "Jr.Tester", true);
    Offer offer4 = new Offer("BAE", 90000, true, "QA", true);
    Offer offer5 = new Offer("Palo Alto", 130000, false, "Jr.SDET", true);
    Offer offer6 = new Offer("Google", 150_000, true, "SDET", false);
    Offer offer7 = new Offer("Google", 150_000, false, "SDET", false);


    ArrayList<Offer>offerArr = new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));

        offerArr.removeIf(each -> !each.isLocal|| !each.isFullTime);
        System.out.println(offerArr);

    }

}
class Offer{
    String company;
    int offerSalary;
    boolean isLocal;
    String position;
    boolean isFullTime;



    public Offer(String company, int offerSalary, boolean isLocal, String position, boolean isFullTime) {
        this.company = company;
        this.offerSalary = offerSalary;
        this.isLocal = isLocal;
        this.position = position;
        this.isFullTime = isFullTime;


    }
    @Override
    public String toString() {
        return "Offer{" +
                "company='" + company + '\'' +
                ", offerSalary=" + offerSalary +
                ", isLocal=" + isLocal +
                ", position='" + position + '\'' +
                ", isFullTime=" + isFullTime +
                '}';
    }

}