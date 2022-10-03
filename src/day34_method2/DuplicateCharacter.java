package day34_method2;
/*
Duplicate Characters

create a method that will accept a word(String) and return a String with all the duplicate characters. A character is duplicate if it only appears in the String multiple times

Hint: use your frequency method to do some of the work

Ex:
	Input:
		aaaaabcccdeeff

	Output:
acef
 */

public class DuplicateCharacter {

        public static int frequencyOfCharacter(String word, char letter) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }


    public static String dubplicateCharacter (String word){

        String result = "";
        for (int i = 0; i<word.length(); i++) {
            int count= frequencyOfCharacter (word, word.charAt(i));
            if (count > 1 && !result.contains(""+word.charAt(i))){
                result += word.charAt(i);
            }

        }return result;
    }


    public static void main(String[] args) {
        System.out.println(dubplicateCharacter("aaaaabcccdeeff"));
    }}
