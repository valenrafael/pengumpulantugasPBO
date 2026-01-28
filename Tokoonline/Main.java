import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Hitung Ongkir Toko Online ===");

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = input.nextDouble();

        System.out.println("Pilih layanan pengiriman:");
        System.out.println("1. Reguler");
        System.out.println("2. Express");
        System.out.println("3. Same Day");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = input.nextInt();

        // Polymorphism: pakai referensi class induk
        Pengiriman pengiriman = null;

        switch (pilihan) {
            case 1:
                pengiriman = new Reguler(berat, jarak);
                break;
            case 2:
                pengiriman = new Express(berat, jarak);
                break;
            case 3:
                pengiriman = new SameDay(berat, jarak);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                System.exit(0);
        }

        System.out.println("\n=== Rincian Pengiriman ===");
        pengiriman.tampilkanRincian();

        input.close();
    }
}
