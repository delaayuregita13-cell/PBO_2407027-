package latihan_pbo.latihan1.Tugas_13_04_26;

public class BangunDatar {

    //encapsulation
    private double varA;
    private double varB;

    // Constructor 2parameter berbeda
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0; 
    }

    // Getter 
    public double getVarA() { 
        return varA; 
    }


    public double getVarB() { 
        return varB; 
    }

    // Method hitungLuas 
    public double hitungLuas() {
        return 0;
    }

    // Method tampilkan 
    public void tampilkan() {
       System.out.println("Bangun Datar");
        System.out.println("===================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("===================");
    }
}
