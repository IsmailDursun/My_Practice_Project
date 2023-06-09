package day22_tasks;

public class URLParts {
    public static void main(String[] args) {

        String url = "https://learn.loopcamp.com/courses/130";
        String [] urlArr = url.split("/");

        for(String part:urlArr){
            System.out.println(part);
        }
    }
}
