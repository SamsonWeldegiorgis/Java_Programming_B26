package day55_polymorphism.Extra_Final;

import day55_polymorphism.DriverTask.ChromeDriver;
import day55_polymorphism.DriverTask.SafariDriver;
import day55_polymorphism.DriverTask.WebDriver;

public class P03_InstanceOf {

    public static void main(String[] args) {

        // Create a method that will return us a webdriver based on user inputs

        WebDriver driver=DriverUtil.getDriver("safari");

        if(driver instanceof SafariDriver){
            ((SafariDriver) driver).fast();
            ((SafariDriver) driver).secure();
            ((SafariDriver) driver).talk();
        }

        System.out.println("--------------------------");

        WebDriver driver2=DriverUtil.getDriver("firefox");
        // WebDriver driver =new FirefoxDriver();

        if(driver2 instanceof ChromeDriver){
            ((ChromeDriver)driver2).get("www.google.com");
        } else if (driver2 instanceof SafariDriver) {
            ((SafariDriver) driver2).secure();
        }else {
            driver2.get("www.google.com");
        }

    }
}


