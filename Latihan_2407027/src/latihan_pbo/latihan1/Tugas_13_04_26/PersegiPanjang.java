package latihan_pbo.latihan1.Tugas_13_04_26;

public class PersegiPanjang extends BangunDatar {
    public PersegiPanjang(double p, double l) {
        super(p, l); 
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarB();
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("===================");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("===================");
    }
}
