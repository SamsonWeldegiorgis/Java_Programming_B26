package day49_inheritance.App;

public class Instagram extends App {

        public Instagram ( double version) { // parametzd constrctr
            super("Instagram", version);// hard coded to avoid repeating it outside,,,the Instagram...

        }
        public void postPicture(){
            System.out.println("Posting picture to Instagram");

        }
}


/*
   new Instagram ("Instagram", 2.1);
   new Instagram ("Instagram", 4.5);
   new Instagram ("Instagram", 6.4);
 */




