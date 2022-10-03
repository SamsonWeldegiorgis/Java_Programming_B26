package day34_method2;

public class FrqncyOfCharacter {
    /*
    Frequency of Character

create a method that will accept a word(String) and a letter (char)
 and return how many times that given letter is found in the given word

Ex:	Input: 		apple, p	Output:		2
Ex:	Input:		apple, z	Output:		0
Ex:	Input:		aabbaacca, a	Output:  5
     */

    public static void main(String[] args) {
        System.out.println(frqcyOfCharacter("apple",'p')); // 2
        System.out.println(frqcyOfCharacter("aabbaacca", 'a')); // 5
    }

    public static int frqcyOfCharacter (String word, char letter){

        int count = 0 ;
        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i) ==letter){
                count++;
            }

        }return count;
    }
}
