package day55_polymorphism.Extra_Final;

import day55_polymorphism.DriverTask.*;

public class P04_TakeScreenShot_JS {

    public static void main(String[] args) {

        // How to take screenshot
        WebDriver driver=new ChromeDriver();

        ((RemoteWebDriver)driver).TakeScreenShot("pic001");

        ((TakeScreenshot)driver).TakeScreenShot("pic002");


        // how to executeScripts
        ((JavaScriptExecuter)driver).executeScript("Executing Script");




    }
}
