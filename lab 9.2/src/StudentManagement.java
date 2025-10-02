import java.util.Scanner;

class Student {
    String name;
    int age;
    String grade;

    void inputDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter grade: ");
        grade = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students? ");
        int n = Integer.parseInt(sc.nextLine());

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for student " + (i + 1));
            students[i] = new Student();
            students[i].inputDetails(sc);
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
        }

        sc.close();
    }
}
