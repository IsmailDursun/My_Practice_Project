package day21_tasks;

public class WebsiteChecker {
    public static void main(String[] args) {
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
    }
}
