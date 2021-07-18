package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;


        System.out.println("Enter your students name (or ENTER to finish):");

        // Get student names and id numbers

        do {

            System.out.print("Enter student name: ");
            studentName = input.nextLine();

            if (!studentName.equals("")) {
                System.out.print("Student ID Number: ");
                Integer idNumber = input.nextInt();
                students.put(idNumber, studentName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!studentName.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Name: " + student.getValue() + " | ID Number: " + student.getKey());
        }

        input.close();
    }
}

