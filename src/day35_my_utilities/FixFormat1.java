package day35_my_utilities;

public class FixFormat1 {
    public static void main(String[] args) {
        fixFormat("jamES");
        System.out.println(fixFormat("jamES"));
    }

    public static String fixFormat(String str){
        str = str.trim();
        return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
    }

}
