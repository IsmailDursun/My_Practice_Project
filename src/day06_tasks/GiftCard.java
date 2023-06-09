package day06_tasks;

public class GiftCard {

    public static void main(String[] args) {

        int giftCardBalance = 200;
        int item1 = 40;
        int item2 = 100;
        int remainingBalance = giftCardBalance - (item1 + item2);

        System.out.println("The gift card started with a balance of $"+giftCardBalance+
                ", after buying item1 for $"+ item1 + " and item2 for $"+ item2 +
                ", the remaining balance of the gift card is $" + remainingBalance );
    }
}
