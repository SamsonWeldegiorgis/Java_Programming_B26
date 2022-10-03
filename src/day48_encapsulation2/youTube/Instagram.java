package day48_encapsulation2.youTube;

public class Instagram extends Class{

    public Instagram(String name,int version){
        super("InstaGR",version );
    }
    public void postPicture(){
        System.out.println(name + " Posting picture to Instagram");
    }

}
