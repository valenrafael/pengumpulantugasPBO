public class Reguler extends Pengiriman {

    public Reguler(double berat, double jarak) {
        super(berat, jarak);
    }

    @Override
    public double hitungOngkir() {
        return 5000 + (2000 * berat) + (500 * jarak);
    }

    @Override
    public String estimasiPengiriman() {
        return "3 - 5 hari";
    }

    @Override
    public String getJenisLayanan() {
        return "Reguler";
    }
}
