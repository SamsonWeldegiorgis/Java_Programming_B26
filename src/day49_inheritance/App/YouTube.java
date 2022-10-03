package day49_inheritance.App;

public class YouTube extends App {

        public YouTube (double version){
            super("YouTube", 2.5);
        }

        public void watchVideo(){
            System.out.println("Watching java tutorial in version "+version);
        }

}
