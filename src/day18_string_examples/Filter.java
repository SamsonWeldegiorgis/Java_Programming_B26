package day18_string_examples;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        /*
        enter a message , clean the message for empty space in the beginning and end
        check the message for bad phrases :
            java is bad
            quit
            have fun
            crying

            if there is a bad phrase in the message  print:
            message failed to send

            other wise print :message sent
         */

        Scanner input = new Scanner(System.in);
        System.out.println("\nPut a message");
        String message = input.nextLine();  // input.nextLine().toLowerCase().trim();,,,,,,this is called chaining
        message = message.toLowerCase();
        message=message.trim();

        if (message.contains("java is bad") || message.contains( "quit" )
                        || message.contains("have fun") || message.contains ("crying")){

                System.out.println("Mesage failed to send ");
        } else {
            System.out.println("\""+ message+ "\"" + ": was sent");
        }

    }
}
