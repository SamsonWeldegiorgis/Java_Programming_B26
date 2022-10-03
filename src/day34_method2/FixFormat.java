package day34_method2;

public class FixFormat {
    /*
    Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
James
     */
    public static void main(String[] args) {
        fixFormat("jamES");
        System.out.println(fixFormat("jamES"));
    }

    public static String fixFormat (String str){
//        str = str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();

    return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
}}


/*
public static String properFormat(String str){

    //  str = str.substring(0,1).toUpperCase()+ str.substring(1).toLowerCase();
      return str.substring(0,1).toUpperCase()+ str.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        properFormat("jamES");
        System.out.println(properFormat("jamES"));
    }
 */
