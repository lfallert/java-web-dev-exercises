package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            String wonderland = "alice was beginning to get very tired of sitting by her sister on the bank, and having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought alice 'without pictures or conversation?'" +
                    "";
            System.out.println("Enter term.");
            String searchTerm = input.nextLine();
            if(wonderland.contains(searchTerm.toLowerCase())) {
                System.out.println("Yes, " + searchTerm + " is present. It is located at index " + wonderland.indexOf(searchTerm) + " and is " + searchTerm.length() + " characters long.");
            } else {
                System.out.println("No, " + searchTerm + " is not present.");
            }
            input.close();
        }
    }
}
