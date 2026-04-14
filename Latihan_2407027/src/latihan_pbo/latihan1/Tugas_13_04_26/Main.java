package latihan_pbo.latihan1.Tugas_13_04_26;

public class Main {
    public static void main(String[] args) {
        
        BangunDatar bd;

        // 1. Output Bangun Datar
        bd = new BangunDatar(3.0, 4.0);
        bd.tampilkan();
        System.out.println(); // Memberi jarak

        // 2. Output Persegi
        bd = new Persegi(5.0);
        bd.tampilkan();
        System.out.println(); // Memberi jarak

        // 3. Output Persegi Panjang
        bd = new PersegiPanjang(6.0, 4.0);
        bd.tampilkan();
        System.out.println(); // Memberi jarak

        // 4. Output Segitiga
        bd = new Segitiga(8.0, 5.0);
        bd.tampilkan();
    }
}