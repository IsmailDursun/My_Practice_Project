package day33_tasks;

public class DebitCard {
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    static String accountType;
    static{
        System.out.println("Static block is running");
        accountType = "Checking";
    }

    public DebitCard(long cardNumber, String holderName, String cardType){
        this.holderName = holderName;
        if((cardNumber+"").length()==16){
            if(String.valueOf(cardNumber).length()==16){
                this.cardNumber = cardNumber;
            }
        }else{
            System.out.println("Invalid cardNumber");
        }

        if(cardType.equalsIgnoreCase("Master")) {
            this.cardType = cardType;
        }else{
            System.out.println("Invalid cardType");
        }


    }

    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this(cardNumber,holderName,cardType);

        int numPin = String.valueOf(pin).length();

        if(numPin==4){
            this.pin = pin;
        }else{
            System.out.println("Invalid pinLength");
        }

        this.pin = pin;
        this.balance = balance;
    }
}
