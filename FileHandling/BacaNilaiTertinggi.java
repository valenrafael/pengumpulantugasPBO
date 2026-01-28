import java.io.*;

public class BacaNilaiTertinggi {
    public static void main(String[] args) {
        String namaTertinggi = "";
        int nilaiTertinggi = -1;

        // Menggunakan try-with-resources agar file tertutup otomatis
        try (BufferedReader reader = new BufferedReader(new FileReader("nilai.txt"))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                String[] data = baris.split(",");
                String nama = data[0];
                int nilai = Integer.parseInt(data[1]);

                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                    namaTertinggi = nama;
                }
            }
            System.out.println("Mahasiswa dengan nilai tertinggi: " + namaTertinggi + " (" + nilaiTertinggi + ")");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}