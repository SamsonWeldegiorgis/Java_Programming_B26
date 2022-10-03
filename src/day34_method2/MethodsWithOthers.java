package day34_method2;

public class MethodsWithOthers {
////    public static void main(String[] args) {
//
//        System.out.println(dayInWords(2));
//        System.out.println(dayInWords(5));
//        System.out.println(dayInWords(8));
//    }

    public static String dayInWords(int day) {

        String strDay = "";

        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "not valid week number";
        }

    }


    public static int firstEvenNumber(int [] nums){
        for(int num: nums){
            if(num % 2 == 0){
                return  num;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int [] arr = {5, 1, 4, 12, 5};
        System.out.println(firstEvenNumber(arr));

    }

}


//        return strDay;


    /*  we can use also :
             String strDay = "";

        switch (day){
            case 1:
                strDay = "Monday";
                break;
            case 2:
                strDay = "Tuesday";
                break;
            case 3:
                strDay = "Wednesday";
                break;
            case 4:
                strDay = "Thursday";
                break;
            case 5:
                strDay = "Friday";
                break;
            case 6:
                strDay = "Saturday";
                break;
            case 7:
                strDay = "Sunday";
                break;
        }
        return strDay;
    }
     */


