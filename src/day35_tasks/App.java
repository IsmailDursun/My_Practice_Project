package day35_tasks;

public class App {
    String appName;
    double appVersion;

    public App(String appName, double appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }

    public void Download(){
        System.out.println(appName+" is dowloading version "+appVersion);
    }
}
