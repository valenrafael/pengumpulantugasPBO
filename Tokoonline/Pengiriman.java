public abstract class Pengiriman {
    protected double berat;
    protected double jarak;

    public Pengiriman(double berat, double jarak) {
        this.berat = berat;
        this.jarak = jarak;
    }

    // Method abstract (akan dioverride di class anak)
    public abstract double hitungOngkir();
    public abstract String estimasiPengiriman();
    public abstract String getJenisLayanan();

    // Method untuk menampilkan rincian
    public void tampilkanRincian() {
        System.out.println("Jenis Layanan      : " + getJenisLayanan());
        System.out.println("Berat Paket (kg)   : " + berat);
        System.out.println("Jarak Pengiriman   : " + jarak + " km");
        System.out.println("Ongkir             : Rp " + hitungOngkir());
        System.out.println("Estimasi Pengiriman: " + estimasiPengiriman());
    }
}
