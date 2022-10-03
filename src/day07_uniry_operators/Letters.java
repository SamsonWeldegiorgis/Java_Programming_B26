package day07_uniry_operators;

public class Letters {
    public static void main(String[] args) {

        // Task : define a character. print me the next four characters on new lines.

        char letter = 'L';

        System.out.println("\nletter++ of L : " + letter++);//L
        System.out.println("Next four :" );
        System.out.println(letter++);// post increment =M     M>N
        System.out.println(letter++);//post increment =N      N>O
        System.out.println(letter++);// post increment = O     O>P
        System.out.println(letter++);//post increment = P       P>Q



        char letter1 = 'L';

        System.out.println("\nletter1--of L : " + letter1--);//L
        System.out.println("Next four :" );
        System.out.println(letter1--);// post increment =K  ....K >
        System.out.println(letter1--);//post increment =J     ....J>J..
        System.out.println(letter1--);// post increment =I        I>I
        System.out.println(letter1--);//post increment = H        H

        char letter2 = 'L';

        System.out.println("\n++letter2 of L : " + ++letter2);//M
        System.out.println("Next four :" );
        System.out.println(++letter2);// post increment =N
        System.out.println(++letter2);//post increment =O
        System.out.println(++letter2);// post increment =P
        System.out.println(++letter2);//post increment = Q



        char letter3 = 'L';

        System.out.println("\n--letter3 of L : " + --letter3);//K
        System.out.println("Next four :" );
        System.out.println(--letter3);// post increment =J
        System.out.println(--letter3);//post increment =I
        System.out.println(--letter3);// post increment =H
        System.out.println(--letter3);//post increment = G


    }
}
