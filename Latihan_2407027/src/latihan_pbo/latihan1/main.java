package latihan_pbo.latihan1;

class Cafe{
    String nama;
    String alamat;

    // constructor
    Cafe(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("nama cafenya adalah : " + nama);
        System.out.println("alamatnya di : " + alamat);
        System.out.println("=====================");
    }
    // method
    void buka(){
        System.out.println("=====================");
         System.out.println("Cafe Sudah Buka");
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}


public class main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe ("Oksigen", "Indramayu");

        System.out.println("====================");
        Cafe cafe5 = new Cafe ("Dinnum", "Kroya");
        cafe1.buka();
    }
}