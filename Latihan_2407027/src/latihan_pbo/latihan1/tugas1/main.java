package latihan_pbo.latihan1.tugas1;

import java.util.Scanner;

class CafeChocolatos {
    // Enkapsulasi: Variabel diproteksi dengan private
    private String namaMinuman;
    private int bahan1; 
    private int bahan2; 
    private int bahan3; 

    // Setter untuk mengisi data dari luar class
    public void setBahan(int b1, int b2, int b3) {
        this.bahan1 = b1;
        this.bahan2 = b2;
        this.bahan3 = b3;
    }

    // Setter untuk nama (Sudah diperbaiki)
    public void setNama(String nama) {
        this.namaMinuman = nama;
    }

    // Method Logika untuk mengecek perbandingan takaran
    public void racik() {
        System.out.println("--- Resep " + this.namaMinuman + " ---");
        System.out.println("Bahan 1: " + bahan1);
        System.out.println("Bahan 2: " + bahan2);
        System.out.println("Bahan 3: " + bahan3);

        // Bagian Logika Perbandingan
        if (bahan1 > bahan2) {
            System.out.println("Hasil: Bahan 1 lebih besar dari Bahan 2 (Kental)");
        } else if (bahan1 == bahan2) {
            System.out.println("Hasil: Bahan 1 sama dengan Bahan 2 (Pas)");
        } else if (bahan1 < bahan2) {
            System.out.println("Hasil: Bahan 1 lebih kecil dari Bahan 2 (Encer)");
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CafeChocolatos menu = new CafeChocolatos();

        menu.setNama("Chocolatos Hot");
        System.out.print("Input Jumlah Bubuk (Angka): ");
        int b1 = input.nextInt();
        System.out.print("Input Jumlah Air (Angka): ");
        int b2 = input.nextInt();
        System.out.print("Input Jumlah Susu (Angka): ");
        int b3 = input.nextInt();

        // Kirim data ke class CafeChocolatos
        menu.setBahan(b1, b2, b3);

        menu.racik();

        input.close();
    }
}