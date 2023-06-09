package day38_tasks;

public class JavaTextBook extends Ebook{
    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading");

    }

    @Override
    public void download() {
        System.out.println("Downloading");

    }
    @Override
    public void open(){
        System.out.println("Opening");
    }
}
