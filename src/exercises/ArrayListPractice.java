package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.add(1);
        numArray.add(1);
        numArray.add(2);
        numArray.add(3);
        numArray.add(5);
        numArray.add(8);
        numArray.add(8);
        numArray.add(11);
        numArray.add(12);
        numArray.add(15);

        System.out.println(Sum.getSum(numArray));
        Scanner input = new Scanner(System.in);

        ArrayList<String> wordArray = new ArrayList<>();
        wordArray.add("cat");
        wordArray.add("zebra");
        wordArray.add("dog");
        wordArray.add("snake");
        wordArray.add("bear");

        System.out.println(FiveLetters.hasFiveLetters(wordArray));

        

    }

}

