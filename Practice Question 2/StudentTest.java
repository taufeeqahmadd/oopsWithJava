package PractiseQues2;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 101, 85.5);
        Student s2 = new Student("Priya", 102, 91.0);

        System.out.println(s1.getName());
        System.out.println("Marks: " + s2.getMarks());
        System.out.println("Total Students: " + Student.studentCount);
    }
}
