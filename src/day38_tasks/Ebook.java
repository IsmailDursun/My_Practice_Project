package day38_tasks;

public abstract class Ebook extends Book implements Downloadable{
    int size;
    public void open(){
        System.out.println("Turn on");

    }
}
