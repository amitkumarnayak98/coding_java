import java.io.*;
import java.util.*;

//Class to represent Date of Birth
class DOB {
    int day;
    int month;
    int year;

    public DOB(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class Student {
    String name;
    DOB dob; // Date of birth
    int rollNo;
    float m1, m2, m3; // Marks for three subjects

    public Student(String name, DOB dob, int rollNo, float m1, float m2, float m3) {
        this.name = name;
        this.dob = dob;
        this.rollNo = rollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + String.format("%02d/%02d/%d", dob.day, dob.month, dob.year));
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + String.format("%.2f, %.2f, %.2f", m1, m2, m3));
    }

    // Method to write student information to a file
    public void writeToFile(FileWriter writer) throws IOException {
        writer.write("Name: " + name);
        writer.write("Date of Birth: " + String.format("%02d/%02d/%d", dob.day, dob.month, dob.year));
        writer.write("Roll No: " + rollNo);
        writer.write("Marks: " + String.format("%.2f, %.2f, %.2f", m1, m2, m3));
        writer.write("\n");
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Declare an array of students
        Student[] students = new Student[n];

        // Loop to input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Enter name: ");
            sc.nextLine(); // Consume the newline
            String name = sc.nextLine();

            System.out.print("Enter dat of birth(dd mm yyyy): ");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            DOB dob = new DOB(day, month, year);

            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter marks for three subjects: ");
            float m1 = sc.nextFloat();
            float m2 = sc.nextFloat();
            float m3 = sc.nextFloat();

            // Create a new student object and store it in array
            students[i] = new Student(name, dob, rollNo, m1, m2, m3);
        }

        // Display the details of all students
        System.out.println("\n=========Student Information=========\n");
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                System.out.println();
                System.out.println("Details for student " + (i + 1) + ":");
            } else {
                System.out.println("Details for student " + (i + 1) + ":");
            }
            students[i].displayInfo();
        }

        // Write details to a text file
        try {
            FileWriter writer = new FileWriter("student_data.txt");
            writer.write("====== Student Information =========\n");
            for (int i = 0; i < n; i++) {
                writer.write("\nDetails for student " + (i + 1) + ":");
                students[i].writeToFile(writer);
            }
            writer.close();
            System.out.println();
            System.out.println("Student data written to 'student_data.txt' successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        sc.close();
    }
}
