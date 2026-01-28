import java.util.ArrayList;

public class LatihanWrapper {
    public static void main(String[] args) {
        ArrayList<String> daftarString = new ArrayList<>();
        daftarString.add("10");
        daftarString.add("20");
        daftarString.add("30");

        ArrayList<Integer> daftarInteger = new ArrayList<>();
        for (String s : daftarString) {
            // Mengonversi String ke Integer menggunakan Integer.parseInt
            daftarInteger.add(Integer.parseInt(s));
        }

        System.out.println("ArrayList Integer: " + daftarInteger);
    }
}