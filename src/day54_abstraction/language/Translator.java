package day54_abstraction.language;

public class Translator extends Spanish{

    public static void main(String[] args) {

//        Language obj = new Language(); can NOT create objects of interface


        Spanish spanish = new Spanish();
        spanish.hi();
        spanish.bye();

        Turkish turkish = new Turkish();
        turkish.hi();
        turkish.bye();

        System.out.println(Language.PLANET);

    }


}
