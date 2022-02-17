package userinteration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // 1. create a File object and Scanner to read the text file
        int wordCounter = 0;
        try {
            File file = new File("vancouver.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                wordCounter += line.split(" ").length;
            }
//            // if there's next word to read
//            while (in.hasNext()) {
//                // then read the word
//                String word = in.next();
//                // increment the wordCounter
//                wordCounter++;
//            }
            System.out.println("The file contains " + wordCounter + " words.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
