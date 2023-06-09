
package replit;
public class PlaneTicket {

    public static void main(String[]args){

                //DO NOT TOUCH THESE LINE/LINES.
                String cityOne =  " Chicago ";
                String cityTwo = " Virginia ";
                double basePrice = 152.4;
                double milesBetweenCities = 739.8;
                int rate = 3;

                //WRITE YOUR CODE BELOW:
                double ticketPrice = basePrice + milesBetweenCities / rate;

                System.out.println("The ticket price from"+cityOne+"to"+cityTwo+"is $"+ticketPrice);
    }
}
