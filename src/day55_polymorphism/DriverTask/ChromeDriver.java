package day55_polymorphism.DriverTask;

public class ChromeDriver extends RemoteWebDriver{
    @Override
    public void get(String URL) {
        System.out.println("Opening in Chrome");
    }
}



