package day34_method2;

//public class UniqueCharacters {
    /*

Unique Characters

create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

Hint: use your frequency method to do some of the work

Ex:  	Input:		aaaaabcccdeeff	Output: bd
     */


//    public static int frequencyOfCharacter(String word, char letter) {
//
//        int count = 0;
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == letter) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        uniqueChar("aaaaabcccdeeff");
//    }
//
//    public static String uniqueChar(String word) {
//
//        String result = "";
//        for (int i = 0; i < word.length(); i++) {
//            int count = frequencyOfCharacter(word, word.charAt(i));
//
//            if (count == 1) {
//                result += word.charAt(i);
//
//            }
//        }
//        return result;
//
//    public static void main(String[] args) {
//        System.out.println(frequencyOfCharacter("aabbaacca", 'a'));
//        public static int frequencyOfCharacter (String word, char letter){
//
//            int count = 0;
//            for (int i = 0; i < word.length(); i++) {
//                if(word.charAt(i) == letter) {
//                    count++;
//                }
//            }
//            return count;
//        }
//}
