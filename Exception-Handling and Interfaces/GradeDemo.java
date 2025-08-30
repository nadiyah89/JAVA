import java.util.*;

interface Grading {
    void calculateGrade();
}

class Student implements Grading {
    int marks;
    Student(int m) { marks = m; }
    public void calculateGrade() {
        if(marks >= 90) System.out.println("Grade: A");
        else if(marks >= 75) System.out.println("Grade: B");
        else if(marks >= 50) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");
    }
}

public class GradeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter marks: ");
            int m = sc.nextInt();
            Student s = new Student(m);
            s.calculateGrade();
        } catch(InputMismatchException e) {
            System.out.println("Invalid input! Enter integer marks.");
        }
    }
}
