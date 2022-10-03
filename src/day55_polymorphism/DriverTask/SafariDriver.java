package day55_polymorphism.DriverTask;

public class SafariDriver extends RemoteWebDriver implements SmartBrowser {
    @Override
    public void talk() {
        System.out.println("Talking");
    }

    @Override
    public void fast() {
        System.out.println("Fastest Browser");

    }

    @Override
    public void secure() {
        System.out.println("Secure Browser");
    }
}
