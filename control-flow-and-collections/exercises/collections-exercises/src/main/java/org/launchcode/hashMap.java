package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMap {
    public static class HashMapGradebook {

        public static void main(String[] args) {

            HashMap<Double, String> students = new HashMap<>();
            Scanner input = new Scanner(System.in);
            String newStudent;

            System.out.println("Enter your students ID's(or ENTER to finish):");

            // Get student names and grades
            do {

                System.out.print("Student: ");
                newStudent = input.nextLine();

                if (!newStudent.equals("")) {
                    System.out.print("Name: ");
                    String newGrade = input.next();
                    students.put(Double.valueOf(newStudent), newGrade);

                    // Read in the newline before looping back
                    input.nextLine();
                }

            } while(!newStudent.equals(""));

            // Print class roster
            System.out.println("\nClass roster:");


            for (Map.Entry<Double, String> student : students.entrySet()) {
                System.out.println(student.getKey() + " (" + student.getValue() + ")");

            }


        }
    }
}
