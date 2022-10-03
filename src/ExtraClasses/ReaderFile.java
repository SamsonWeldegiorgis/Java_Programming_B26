package ExtraClasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReaderFile {

    public static void main(String[] args) throws Exception{

        FileReader file1 = new FileReader("TextFile.txt");
        BufferedReader read = new BufferedReader(file1);

        System.out.println(read.readLine());
        System.out.println(read.readLine());
        System.out.println(read.readLine());

        System.out.println(" ====================================");

        Scanner scan= new Scanner(new FileReader("TextFile.txt"));

        while (scan.hasNext()){
            System.out.println(scan.nextLine());
        }


    }
}
