package ExtraClasses;

import day36_overlloadin_method.Fibonacci;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class WriterFile {
    public static void main(String[] args) throws Exception {

        FileWriter file2 = new FileWriter("TextWrite.txt");
        BufferedWriter writer = new BufferedWriter(file2);

        writer.write("The cup is on the table");
        writer.write("\nI am happy today for the word");
        writer.write("\nFamily are coming home soon");

        writer.close();



    }
}
