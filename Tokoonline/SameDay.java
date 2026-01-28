public class SameDay extends Pengiriman {

    public SameDay(double berat, double jarak) {
        super(berat, jarak);
    }

    @Override
    public double hitungOngkir() {
        return 20000 + (4000 * berat) + (1200 * jarak);
    }

    @Override
    public String estimasiPengiriman() {
        return "6 - 10 jam";
    }

    @Override
    public String getJenisLayanan() {
        return "Same Day";
    }
}
