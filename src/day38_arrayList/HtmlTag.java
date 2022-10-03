package day38_arrayList;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HtmlTag {

    public static void main1(String[] args) {
//        System.out.println(Arrays.toString("li^3".split("\\^"))); // li 3
//        System.out.println(htmlGenerate("li^3"));
//        System.out.println(htmlGenerate("div^2"));
//        System.out.println(htmlGenerate("div^6"));
//        System.out.println(htmlGenerate("ul^4"));
    }

    public static String htmlGenerate(String str) {

        String html = "";
        String[] parts = str.split("\\^"); // str.replace ("^", " ").split(" ");

        int repeat = Integer.parseInt(parts[1]); // 2 or 3
        for (int i = 0; i <repeat ; i++) {

            html+="<"+parts[0]+">" + "</"+parts[0] + ">";
        }
        return html;

    }

    ////////////////other way of making it


    public static void main(String[] args) {
        String html = "div^2";

        String sub = html.substring(0, html.indexOf("^")); // li
        String sub1= html.substring(html.indexOf("^")+1); // 2
        System.out.println("Sub: " + sub);
        System.out.println("Sub3: " + sub1);
        int repeat =0;
        String h = "";

        Integer repeat1= Integer.parseInt(sub1);
        for (int i = 0; i <repeat1; i++) {

             h+= "<" + sub + ">" + "</" + sub + ">";
        }System.out.println(h);

    }}



//    public static void main(String[] args) {
//        String html = "div^2";
//
//        String sub= html.substring(0, html.length()-2);
//        System.out.println(sub);
//        String h= "<"+sub+">"+"</"+sub+">";
//        System.out.println(h+" " + h);
//
//        System.out.println("--------------------------------");
//
//        String html1 = "li^3";
//
//        String sub1= html1.substring(0, html1.length()-2);
//        System.out.println(sub1);
//        String h1= "<"+sub1+">"+"</"+sub1+">";
//        System.out.println(h1+" " + h1+ " "+h1);



