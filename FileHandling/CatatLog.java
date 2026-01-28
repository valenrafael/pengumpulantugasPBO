import java.io.*;
import java.util.Date;

public class CatatLog {
    public static void main(String[] args) {
        // Parameter 'true' mengaktifkan append mode
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            String pesan = "User melakukan login";
            writer.write(new Date() + " - " + pesan);
            writer.newLine();
            System.out.println("Log berhasil dicatat.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}