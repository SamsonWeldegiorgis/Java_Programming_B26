package day1_04_04_2022;

public class P01_TimeStamp {
    /*
    String date : "10/10/2022 14:59:00";
    timrSt // 10102020145900
     */

    public static void main(String[] args) {

        String date = "10/10/2022 14:59:00";

        date = date.replace("/", "");
        System.out.println("1: " + date);

        date = date.replace(" ", "");
        System.out.println("2: " + date);

        date = date.replace(":", "");
        System.out.println("3: " + date);

        System.out.println("from String return method:"+timeStamp("10/10/2022 14:59:00"));
        timeStampwithVoid( "10/10/2022 14:59:00");
    }

    public static String timeStamp(String dateFromUI){
        return dateFromUI = dateFromUI.replace("/", "").replace(" ","").replace(":","");
    }
    public static void timeStampwithVoid(String date){
        date= date.replace("/", "").replace(" ","").replace(":","");
        System.out.println("from void method:  " + date);

        System.out.println(" ------another ways-----------------------------");

        String date1 = "10/10/2022 14:59:00 ";

        String numbers = "";
        String special = "";

        for (int i = 0; i < date1.length(); i++) {


            if (Character.isDigit(date1.charAt(i))) {
                numbers += date1.charAt(i);
            } else {
                special += date1.charAt(i);
            }
        }
        System.out.println(numbers);
        System.out.println(special);


    }
}
