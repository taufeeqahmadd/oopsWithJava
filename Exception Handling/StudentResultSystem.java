// Question 2 — Student Result System
// Scenario: A university result system accepts marks for a student. Marks must be between 0
// and 100.
// (a) Create a class Student with name and marks. 
// (b) Create a method setMarks(int marks) that throws an exception when marks are less
// than 0 or greater than 100. 
// (c) Use try-catch to handle the invalid marks entered by the user. 
// (d) Use a finally block to display "Result processing completed." 

import java.util.Scanner;

class Student {
    private String name;
    private int marks;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Method to set marks
    public void setMarks(int marks) throws Exception {
        if (marks < 0 || marks > 100) {
            throw new Exception("Invalid marks! Marks must be between 0 and 100.");
        }

        this.marks = marks;
    }

    // Method to display student result
    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentResultSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        Student student = new Student(name);

        try {
            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();

            student.setMarks(marks);
            student.displayResult();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Result processing completed.");
            scanner.close();
        }
    }
}
