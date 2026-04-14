package Tugas_06_04_2026;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    // Constructor BangunRuang
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); 
        this.tinggi = tinggi;
    }
    // Method hitung volume 
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}