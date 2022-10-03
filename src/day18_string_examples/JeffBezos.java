package day18_string_examples;

import java.util.Scanner;

public class JeffBezos {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String email = scan.next();


        String email = "jeff_bezos@amazon.us";
        String firstName ="";
        String lastName ="";

        //////   jeff_bezos@amazon.us
        ////        firstname = Jeff;
        ////        lastname  = Bezoz;
        ////        domain = Amazon.us

        int firstNameIndex =email.indexOf('0');
        int firstNextIndex =email.indexOf('_');

        int lastNameIndex = email.indexOf('_');
        int lastNextIndex = email.indexOf('@');

        int domainIndex = email.indexOf('@');
        int domainNextIndex = email.lastIndexOf('.');

        System.out.println("First Name : "+ email.substring(0,firstNextIndex-3).toUpperCase()+
                email.substring(firstNameIndex+2,firstNextIndex));
        System.out.println("Last Name : "+ email.substring(lastNameIndex+1,lastNextIndex-4).toUpperCase()+
                email.substring(lastNameIndex+2,lastNextIndex));
        System.out.println("Domain Name : "+ email.substring(domainIndex+1,domainNextIndex-5).toUpperCase()+
                email.substring(domainIndex+2,domainNextIndex));



        ///for sergey_brin@gmail.com

        int firsFirst = email.indexOf(0);
        int lastFirst = email.indexOf('_');
        // firsFirst+1, lastFirst-5).toUpperCase()  ....to upper J / S

        int firsLast = email.indexOf('_');
        int lastLast = email.indexOf('@');

        int firsDomain = email.indexOf('@');
        int lastDomain = email.indexOf('.');

//        sergey_brin@gmail.com
//
//        String firstName =email.substring(firsFirst+1, email.lastIndexOf('_')-3).toUpperCase()
//                + email.substring(firsFirst+2, lastFirst);
//        System.out.println("First name: "+firstName);
//
//        String lastName =email.substring(firsLast+1,lastLast-3).toUpperCase()
//                +email.substring(firsLast+2,lastLast);
//        System.out.println("Last name: "+ lastName);
//
//        String domain =email.substring(firsDomain+1,lastDomain-4).toUpperCase()
//                +email.substring(firsDomain+2,lastDomain);
//        System.out.println("Domain: "+domain);


        ////or //////////// for jeff_bezos@amazon.us
        int firsFirst1 = email.indexOf(0);
        int lastFirst1 = email.indexOf('_');

        int firsLast1 = email.indexOf('_');
        int lastLast1 = email.indexOf('@');

        int firsDomain1 = email.indexOf('@');
        int lastDomain1 = email.indexOf('.');


        String firstName1 =email.substring(0, lastFirst1-3).toUpperCase()
                + email.substring(firsFirst1+2, lastFirst1);
        System.out.println("First name: "+firstName1);

        String lastName1 =email.substring(firsLast+1,lastLast1-4).toUpperCase()
                +email.substring(firsLast1+2,lastLast1);
        System.out.println("Last name: "+ lastName1);

        String domain1 =email.substring(firsDomain1+1,lastDomain1-5).toUpperCase()
                +email.substring(firsDomain1+2,lastDomain1);
        System.out.println("Domain: "+domain1);

    }    }



