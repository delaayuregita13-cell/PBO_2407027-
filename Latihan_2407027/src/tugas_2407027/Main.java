package tugas_2407027;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunRuang br = new BangunRuang(); 

        System.out.println("=== KALKULATOR BANGUN DATAR ===");
        System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran");
        System.out.print("Pilih (1-4): ");
        int pil = input.nextInt();

        switch(pil) {
            case 1:
                System.out.print("Sisi: "); br.setSisi(input.nextDouble());
                System.out.println("Luas: " + br.luasPersegi());
                System.out.println("Keliling: " + br.kelPersegi());
                break;
            case 2:
                System.out.print("Panjang: "); double p = input.nextDouble();
                System.out.print("Lebar: "); double l = input.nextDouble();
                br.setData(p, l, 0, 0);
                System.out.println("Luas: " + br.luasPPanjang());
                System.out.println("Keliling: " + br.kelPPanjang());
                break;
            case 3:
                System.out.print("Alas: "); int a = input.nextInt();
                System.out.print("Tinggi: "); double t = input.nextDouble();
                br.setData(0, 0, t, a);
                System.out.println("Luas: " + br.luasSegitiga());
                break;
            case 4:
                System.out.print("Jari-jari: "); br.setR(input.nextDouble());
                System.out.println("Luas: " + br.luasLingkaran());
                System.out.println("Keliling: " + br.kelLingkaran());
                break;
        }
        input.close();
    }
}