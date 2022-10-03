package day55_polymorphism.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {

        Form obj = new Form();
        Link obj2 = new Link();
        Input obj3 = new Input();
        Image obj4 = new Image();

        ArrayList<WebElement> elements = new ArrayList<>(); // ArrayList of Webelements, which means the objects implement the WebElement interface
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);
        elements.add(new Form());

        for(WebElement each : elements){
            System.out.println(each.getText());

            if(each instanceof Form){ // are you an object of Form
                ((Form)each).submit();
            }

        }

    }
}

/*
without instanceof part you would be trying to cast all the obje to Form, but does object dont have is a relation to Form
        (Form) link object
        (Form) image object
        (Form) input object
 */
