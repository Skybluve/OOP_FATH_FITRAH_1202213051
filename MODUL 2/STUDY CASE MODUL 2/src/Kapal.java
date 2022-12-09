package src;
public class Kapal {
    // Terdapat 1 variable protected yaitu mesin(String)
    protected String mesin;
    // Terdapat 1 Constructor Kapal(int jumlahKursi, int biaya, String mesin)
    public Kapal(int jumlahKursi, int biaya, String mesin) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
        this.mesin = mesin;
    }
    // Terdapat 4 Method Public yaitu informasi(), berlayar(), berlayar(int kecepatan),berlabuh()
    public void informasi() {
        System.out.println("Transportasi jenis Kapal dengan kursi berjumlah" + jumlahKursi + " ditetapkan biaya sebesar Rp. " + biaya);
    }
    public void berlayar() {
        System.out.println("Transportasi jenis Kapal sedang berlayar menggunakan mesin " + mesin+ "dengan kecepatan tidak stabil");
        }
    public void berlayar(int kecepatan) {
        System.out.println("Transportasi jenis Kapal sedang berlayar  menggunakan mesin diesel dengan kecepatan stabil berkisar " + kecepatan +"knot");
        }
    public void berlabuh() {
        System.out.println("Transportasi jenis Kapal berlabuh di pantai");
        }
    

}
