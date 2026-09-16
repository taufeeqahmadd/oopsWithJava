//Scenario
//A college maintains the marks of students. The system should allow the
//  teacher to add marks, update marks, remove a student's marks, and display all marks.
//Question
//1. Add marks of 5 students.
//2. Display all marks.
//3. Update the marks of the third student.
//4. Remove the marks of the second student.
//5. Display the highest mark.
//6. Display the final list.

import java.util.ArrayList;
import java.util.Scanner;

public class ListProgram1 {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of marks you want to enter : ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            marks.add(sc.nextInt());
        }

        System.out.println(marks);

        System.out.print("Enter marks of 3rd Students to update : ");
        marks.set(2, sc.nextInt());

        System.out.println(marks);

        System.out.println("Remove the marks of second student : ");
        marks.remove(1);
        System.out.println(marks);




    }
}
