import java.io.*;
import java.util.Scanner;

class Emp {
    String name;
    int age;
}

public class FileEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp e = new Emp();

        try {
            // Writing to the file
            FileWriter p = new FileWriter("empdata1.txt", true);
            BufferedWriter writer = new BufferedWriter(p);
            System.out.print("Enter Name and Age: ");
            e.name = sc.next();
            e.age = sc.nextInt();
            writer.write(e.name + " " + e.age);
            writer.newLine();
            writer.close();

            // Reading from the file
            BufferedReader q = new BufferedReader(new FileReader("empdata1.txt"));
            String line;
            System.out.println("The output read from the file: ");
            while ((line = q.readLine()) != null) {
                System.out.println(line);
            }
            q.close();
        } catch (IOException ex) {
            System.out.println("An error occurred: " + ex.getMessage());
        } finally {
            sc.close();
        }

    }
}
