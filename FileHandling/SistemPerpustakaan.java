import java.io.*;
import java.util.ArrayList;

enum StatusBuku {
    TERSEDIA, DIPINJAM
}

class Buku {
    String judul, pengarang;
    Integer tahun; // Wrapper Class
    StatusBuku status;

    Buku(String judul, String pengarang, Integer tahun, StatusBuku status) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun = tahun;
        this.status = status;
    }

    // Format untuk disimpan ke file
    public String toCSV() {
        return judul + "," + pengarang + "," + tahun + "," + status;
    }
}

public class SistemPerpustakaan {
    private static final String FILE_NAME = "perpustakaan.txt";

    public static void main(String[] args) {
        ArrayList<Buku> koleksi = new ArrayList<>();
        koleksi.add(new Buku("Java OOP", "Andi", 2023, StatusBuku.TERSEDIA));
        koleksi.add(new Buku("Struktur Data", "Budi", 2022, StatusBuku.DIPINJAM));

        // 1. Simpan ke File
        simpanKeFile(koleksi);

        // 2. Baca dari File dan Cari Buku
        cariBuku("Java OOP");
    }

    public static void simpanKeFile(ArrayList<Buku> daftar) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Buku b : daftar) {
                writer.write(b.toCSV());
                writer.newLine();
            }
            System.out.println("Data buku berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Error simpan: " + e.getMessage());
        }
    }

    public static void cariBuku(String judulCari) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String baris;
            boolean ditemukan = false;
            while ((baris = reader.readLine()) != null) {
                String[] d = baris.split(",");
                if (d[0].equalsIgnoreCase(judulCari)) {
                    System.out.println("Buku Ditemukan: " + d[0] + " oleh " + d[1] + " (" + d[3] + ")");
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) System.out.println("Buku tidak ditemukan.");
        } catch (IOException e) {
            System.out.println("Error baca: " + e.getMessage());
        }
    }
}