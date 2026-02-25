package tugas_2407027;

public class BangunRuang {
    private double sisi, panjang, lebar, r; 
    protected double tinggi;
    public int alas;

    // Setter & Getter
    public void setSisi(double sisi) { this.sisi = sisi; }
    public void setR(double r) { this.r = r; } 
    public void setData(double p, double l, double t, int a) {
        this.panjang = p; this.lebar = l; this.tinggi = t; this.alas = a;
    }

    // Method Luas
    public double luasPersegi() { return sisi * sisi; }
    public double luasPPanjang() { return panjang * lebar; }
    public double luasSegitiga() { return 0.5 * alas * tinggi; }
    public double luasLingkaran() { return 3.14 * r * r; }

    // Method Keliling 
    public double kelPersegi() { return 4 * sisi; }
    public double kelPPanjang() { return 2 * (panjang + lebar); }
    public double kelLingkaran() { return 2 * 3.14 * r; }
}