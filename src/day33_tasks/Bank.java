package day33_tasks;

public class Bank {
    public static void main(String[] args) {

        DebitCard card1 = new DebitCard(1234567891236547L,"ali", "Debit");
        System.out.println(card1.cardType);


        DebitCard card2 = new DebitCard(2345678912365478L, "veli", "Master");
        System.out.println(card2.cardType);


    }
}
