package day33_methods;

public class Email {
    /*
    JBon@Gmail.com
     */
    public static void main(String[] args) {
        buildEmail("James Bond", "Gmail");
        buildEmail("Anna Smith ", "Yahoo");
    }
    public static void buildEmail(String name,String domain){
        String email = name.substring(0,1); // 1st char
        int space = name.indexOf(" "); // space b/n
        email+=name.substring(space+1 , space+4); // B,,,till 3rd index from space
        email+="@" + domain + ".com";
        System.out.println(email);
    }
}



