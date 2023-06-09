package day21_tasks;

public class Countries {
    public static void main(String[] args) {
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"
        };

        for (String country : countries) {
            System.out.println(country.substring(0, 1).toUpperCase() + country.charAt(country.length() - 1));
        }
        for (String country : countries) {
            if (country.charAt(country.length() - 1) == 'a') {
                System.out.println(country);
            }
        }
        for (String country : countries) {
            if (country.equalsIgnoreCase("united states")) {
                System.out.println("Matched! " + country);
            }
        }
    }
}
