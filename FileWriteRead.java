import java.io.*;
import java.util.*;

public class FileWriteRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        FileReader fr = null;
        try {
            // Writing to the file
            fw = new FileWriter("one.txt");
            System.out.println("Enter data (end with '#'): ");
            String ch;
            while (true) {
                ch = sc.nextLine(); // Read entire line of input
                if (ch.contains("#")) {
                    ch = ch.substring(0, ch.indexOf("#")); // Truncate at '#'
                    fw.write(ch);
                    break;
                }
            }
            fw.close();

            // Reading from file
            fr = new FileReader("one.txt");
            int character;
            System.out.println("Contents of the file: ");
            while ((character = fr.read()) != -1) {
                System.out.print((char) character);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            try {
                if (fw != null)
                    fw.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
