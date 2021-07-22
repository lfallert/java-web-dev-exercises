package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> numArray = new ArrayList<>(Arrays.asList(1,1,2,3,5,8,8,11,12,15));

        System.out.println(Sum.getSum(numArray));
        Scanner input = new Scanner(System.in);

        ArrayList<String> wordArray = new ArrayList<>(Arrays.asList("cat", "zebra", "dog", "snake", "bear"));
        

        System.out.println(FiveLetters.hasFiveLetters(wordArray));

        

    }

}

