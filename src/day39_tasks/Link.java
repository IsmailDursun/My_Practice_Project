package day39_tasks;

public class Link implements WebElement {
    @Override
    public void click() {
        System.out.println("clicking link");
    }

    @Override
    public String getText() {
        return "Link text";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("sending text to link");
        System.out.println(txt);

    }
}
