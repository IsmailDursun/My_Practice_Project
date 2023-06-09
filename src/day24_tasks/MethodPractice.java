package day24_tasks;

public class MethodPractice {
    public static void main(String[] args) {
        currencyConverter("lira", 20);
        System.out.println(fixFormat("jAmEs"));

    }

    public static String fixFormat(String word){
        word = word.trim();
        word = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        return word;
    }
    public static void currencyConverter(String currency, double dollars){

        switch(currency) {
            case "euro" :
                System.out.println(dollars * 0.91);
                break;
            case "yen" :
                System.out.println(dollars * 121.03);
                break;
            case "lira" :
                System.out.println(dollars * 14.85);
                break;
            case "won" :
                System.out.println(dollars * 1217.52);
                break;
            case "rupee" :
                System.out.println(dollars * 181.45);
                break;
            default:
                System.out.println("Invalid currency!");
        }

    }
}
