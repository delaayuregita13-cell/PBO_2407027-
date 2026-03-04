package tugas3;

public class Segitiga extends BangunDatar {

    public double hitungLuas(){
        return 0.5 * getAlas() * getTinggi();
    }


    public double hitungKeliling(double s1, double s2, double s3){
        return s1 + s2 + s3;
    }
}