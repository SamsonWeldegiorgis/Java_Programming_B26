package day34_method2;

public class CreditScore {

    public static void main(String[] args) {
        getCreditScore();  // this value is not used
        int score = getCreditScore();
        System.out.println(score);

        System.out.println(getCreditScore()); // 800
        System.out.println(getCreditScore()+50);  // 850

//        isGoodCreditScore(); // not working
//        System.out.println(isGoodCreditScore()); // not working
        System.out.println(isGoodCreditScore(400)); // false
        System.out.println(isGoodCreditScore(800)); // true

    }

    public static int getCreditScore(){
        return 800;

    }
    public static boolean isGoodCreditScore (int creditScore){
        if (creditScore >= 700){
            return true;
        }else {
            return  false;
        }
    }
}
