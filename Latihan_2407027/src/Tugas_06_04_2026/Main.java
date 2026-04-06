package Tugas_06_04_2026;

public class Main {
    public static void main(String[] args) {
        //Data dari soal 
        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);

        //Menampilkan hasil
        System.out.println("Luas Alas : " + br.hitungLuas());
        System.out.println("Volume    : " + br.hitungVolume());
    }
}