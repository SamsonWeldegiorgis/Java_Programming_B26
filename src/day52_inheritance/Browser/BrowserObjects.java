package day52_inheritance.Browser;

public class BrowserObjects {
    public static void main(String[] args) {



            System.out.println("======= CHROME ======= ");

            Chrome chrome=new Chrome();
            chrome.open();
            chrome.navigate("www.google.com");
            chrome.refresh();
            chrome.close();


            System.out.println("======= FIREFOX ======= ");

            FireFox firefox=new FireFox();
            firefox.open();
            firefox.navigate("www.firefox.com");
            firefox.refresh();
            firefox.close();

        System.out.println("======= SAFARI ======= ");


        Safari safari=new Safari();
        safari.open();
        safari.navigate("www.safari.com");
        safari.refresh();
        safari.close();


        }
    }