package day49_inheritance.App;

public class App {

    String name;
    double version;


    public App(String name , double version ){
        this.name= name;
        this.version=version;
    }
        public void downLoad(){
            System.out.println(name + " is downloading version " + version);
        }

}
