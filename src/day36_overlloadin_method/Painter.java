package day36_overlloadin_method;

public class Painter {
    public static void main(String[] args) {
        Picture.draw();
        Picture.draw(100);
        Picture.draw("red");
        Picture.draw("blue", "yellow");
        Picture.draw(90, 1000);

        String s="200";
        Picture.draw(s);
        System.out.println(s);

        Picture.draw(250, "blue");
      Picture.draw("blue", 250);

    }
}
