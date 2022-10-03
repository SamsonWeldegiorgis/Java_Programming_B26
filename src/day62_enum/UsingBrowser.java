package day62_enum;

import day62_enum.Browser;

public class UsingBrowser {
    public static void main(String[] args) {

       Browser browser = Browser.CHROME;

        switch (browser) {
            case EDGE:
            case CHROME:
                System.out.println("Opening chrome browser");
            case SAFARI:
                System.out.println("Opening safari browser");
            case FIREFOX:

        }
    }
}
