package day05_tasks;

public class ColumbusSailed {
    public static void main(String[] args) {
        String yearSailed = "IN 1491 COLUMBUS SAILED THE OCEANBLUE";
        System.out.println(yearSailed);
        yearSailed = yearSailed.replaceFirst("1491","1492");
        System.out.println(yearSailed);

    }
}
