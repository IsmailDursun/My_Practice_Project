package day39_tasks;

public class Input implements WebElement{
    @Override
    public void click() {
        System.out.println("clicking input");
    }

    @Override
    public String getText() {
        return "input text";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("sending text to input field");
        System.out.println(txt);

    }
}
