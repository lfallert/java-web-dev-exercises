package exercises;

import java.util.Scanner;


public class ArrayListPractice {

    public static void main(String[] args) {
        int[] numArray = {1, 1, 2, 3, 5, 8, 8, 11, 12, 15};
        System.out.println(Sum.getSum(numArray));

        String[] wordArray = {"cat", "zebra", "dog", "snake", "bear"};
        System.out.println(FiveLetters.hasFiveLetters(wordArray));

    }

}

