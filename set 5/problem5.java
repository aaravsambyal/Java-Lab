import java.io.*;

public class problem5 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("data.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
