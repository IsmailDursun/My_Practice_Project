package day35_tasks;

public class AllClassesApp {
    public static void main(String[] args) {

        App app = new App("Faladdin", 2.0);
        Youtube y1 = new Youtube(3.1);
        Instagram i1 = new Instagram(4.2);

        app.Download();
        y1.watchVideo();
        i1.postPicture();


    }
}
