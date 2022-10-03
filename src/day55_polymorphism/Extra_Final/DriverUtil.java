package day55_polymorphism.Extra_Final;

import day55_polymorphism.DriverTask.ChromeDriver;
import day55_polymorphism.DriverTask.FirefoxDriver;
import day55_polymorphism.DriverTask.SafariDriver;
import day55_polymorphism.DriverTask.WebDriver;

public class DriverUtil {




    public static WebDriver getDriver(String browserName){

        WebDriver driver;

        switch (browserName){

            case "chrome":
                // WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;

            case "safari":
                // WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
                break;

            case "firefox":
                // WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;

            default:
                System.out.println("UNKNOWN BROWSER");
                driver=null;

        }

        return driver;

    }

}


