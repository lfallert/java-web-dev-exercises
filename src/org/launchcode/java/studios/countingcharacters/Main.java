package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //String phrase= new Scanner(new File("strings")).useDelimiter("\\Z").next();

       Scanner input = new Scanner(new File("strings.txt"));
        System.out.println("Enter phrase please.");
        String phrase = input.nextLine();
        phrase = phrase.replaceAll("[^a-zA-Z0-9]", "");
        char[] letterArray = phrase.toCharArray();

        //create a new hashmap called charCount
        HashMap<Character, Integer> charCount = new HashMap<>();

        // loop through the array of characters that we got from the input of the user
        // if the character exists as a key, 1 point is added to the value, if not (the else block) adds it as a key
        // and adds 1 to the value
        for (char letter : letterArray) {

            if(charCount.containsKey(letter)) {
                charCount.put(letter, charCount.get(letter) + 1);
            } else {
                charCount.put(letter, 1);
            }
        }
        // this is a loop that prints out the keys and the values
        for(Map.Entry<Character, Integer> printChar : charCount.entrySet()) {
            System.out.println(printChar.getKey() + " : " + printChar.getValue());
        }

    }
}

