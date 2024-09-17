import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            // Opening the file "a.txt" in read mode
            fr = new FileReader("a.txt");
            System.out.println("Contents of the file: ");

            int ch;
            // Read file character by character
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); // Casting 'int' to 'char' to print the character
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oops! file does not exist ... cannot open the requested file");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close(); // Close the file render to prevent resource leaks
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
