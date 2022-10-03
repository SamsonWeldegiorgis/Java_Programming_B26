package day49_inheritance.App;

public class AppStore {
    public static void main(String[] args) {

        Instagram user1 = new Instagram(3.2);
        user1.downLoad();
        user1.postPicture();
        System.out.println();

        YouTube user2 = new YouTube(1.4);
        user2.downLoad();
        user2.watchVideo();
    }
}
