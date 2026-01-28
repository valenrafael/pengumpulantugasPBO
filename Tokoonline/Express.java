public class Express extends Pengiriman {

    public Express(double berat, double jarak) {
        super(berat, jarak);
    }

    @Override
    public double hitungOngkir() {
        return 10000 + (3000 * berat) + (800 * jarak);
    }

    @Override
    public String estimasiPengiriman() {
        return "1 - 2 hari";
    }

    @Override
    public String getJenisLayanan() {
        return "Express";
    }
}
