package day21_tasks;
import java.util.Arrays;
public class AllTasks {
    public static void main(String[] args) {

        System.out.println("========NumberArray=======");
        int[] numbers = new int[100];
        for (int i = 1; i<=100; i++){
            numbers[i-1] = i;
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("========Initials=======");
        String [] names = {"James Bond", "Eve Rell", "Anna Johnson"};

        for (String name : names) {
            String firstLetter = name.substring(0, 1);
            String lastLetter = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2);
            System.out.print(firstLetter + lastLetter + " ");
        }

        System.out.println("========LongestAndShortestStrings=======");
            String [] words = {"Shortest", "and", "Longest", "words", "from", "String", "array"};
            String shortest = words[0];
            String longest = words[0];
        for (String s : words) {
            if (s.length() <= shortest.length()) {
                shortest = s;
            }
            if (s.length() >= longest.length()) {
                longest = s;
            }
        }
        System.out.println("Longest: "+longest+"\nShortest: "+shortest);

        System.out.println("========WebsiteChecker=======");
        String [] websites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com",
                "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};
        int com=0;
        int org=0;
        int edu=0;
        int other=0;
        for (String website : websites) {
            if (website.substring(website.lastIndexOf(".")).equalsIgnoreCase(".com"))
                com++;
            else if (website.substring(website.lastIndexOf(".")).equalsIgnoreCase(".org"))
                org++;
            else if (website.substring(website.lastIndexOf(".")).equalsIgnoreCase(".edu"))
                edu++;
            else
                other++;

        }
        System.out.println(".com = "+com+"\n.org = "+org+"\n.edu = "+edu+"\nother = "+other);

        System.out.println("========GradeBookOne=======");
        String [] students = {"Ali", "Veli", "Deli", "Amo", "Maho"};
        int [] score = {86,75,64,53,42};
        char [] grade = {'A','B','C','D'};
        char [] actualGrade = new char[students.length];
        for (int i = 0; i < students.length; i++) {
            if (score[i] >= 85)
                actualGrade[i] = grade[0];
            else if (score[i] >= 75)
                actualGrade[i] = grade[1];
            else if (score[i] >= 65)
                actualGrade[i] = grade[2];
            else if (score[i] < 65)
                actualGrade[i] = grade[3];
            System.out.println(students[i] + ": " + score[i] +" = "+ actualGrade[i]);
        }

        System.out.println("========GradeBookTwo=======");
        String [] students_ = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int [] score_ = {80,54,100,66,94};
        char [] grade_ = {'A','B','C','D'};
        for (int i = 0; i < students.length; i++) {
            if (score_[i] >= 85)
                actualGrade[i] = grade[0];
            else if (score_[i] >= 75)
                actualGrade[i] = grade[1];
            else if (score_[i] >= 65)
                actualGrade[i] = grade[2];
            else if (score_[i] < 65)
                actualGrade[i] = grade[3];
            System.out.println(students_[i] + ": " + score_[i] +" = "+ actualGrade[i]);
        }

        System.out.println("========Countries=======");
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
        System.out.println("========LongestPalindrome=======");

//        String [] wordsPalindrome = {"java", "longer word", "cvic","apple", "racear", "mo", "ann"};
        String [] wordsPalindrome = {"java", "longer word", "civic","apple", "racecar", "mom", "anna"};
        String reversed = "";
        String longestPalindrome = "";

        System.out.println(Arrays.toString(wordsPalindrome));

            for (String word : wordsPalindrome) {
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed += word.charAt(i);
                }
                if (word.equalsIgnoreCase(reversed)) {
                    System.out.print(reversed+" ");
                    if(reversed.length()>= longestPalindrome.length()) longestPalindrome = reversed;
                }
                reversed = "";
            }
            if(longestPalindrome.length()>0){
                System.out.println("\nlongestPalindrome: "+longestPalindrome);
            }else{
                System.out.println("No palindrome");
            }
    }
}