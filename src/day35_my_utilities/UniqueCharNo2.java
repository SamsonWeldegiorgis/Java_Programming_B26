package day35_my_utilities;

public class UniqueCharNo2 {
    /*
      Ex:   Input:    aaaaabcccdeeff    Output:  bd
     */
    public static String uniqueCharacter( String str) {

        String unique = "";
        String checked ="";

        for (int i = 0; i < str.length(); i++) {
            if(checked.contains(""+ str.charAt(i))) {
                int count = StringUtil.frequencyofCharacter(str, str.charAt(i));
                checked += str.charAt(i);

                if (count == 1) {
                    unique += str.charAt(i);
                }
            }
        }
        return unique;

    }
    public static void main(String[] args) {
        System.out.println(uniqueCharacter("aaaaabcccdeeff"));
    }
}


