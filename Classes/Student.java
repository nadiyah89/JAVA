import java.util.Scanner;

class student {
    int rollNo;
    String name, course;
    int m1, m2, m3;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        System.out.print("Enter marks in 3 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    int total() {
        return m1 + m2 + m3;
    }

    double average() {
        return total() / 3.0;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Course: " + course);
        System.out.println("Total: " + total() + ", Average: " + average());
    }

    public static void main(String[] args) {
        student s = new student();
        s.acceptDetails();
        s.display();
    }
}
