package src;
public class TransportasiAir {
    // Terdapat 2 variable protected yaitu jumlahKursi(int), dan biaya(int)
    protected int jumlahKursi;
    protected int biaya;
    // Terdapat 1 Constructor TransportasiAir(int jumlahKursi, int biaya)
    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    // Terdapat 3 Method public yaitu informasi(), berlayar(), dan berlabuh()
    public void informasi() {
        System.out.println("Transportasi jenis tidak diketahui ini dengan kursi berjumlah  " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }
    public void berlayar() {
        System.out.println("Transportasi dengan jenis tidak diketahui ini sedang berlayar");
    }
    public void berlabuh() {
        System.out.println("Transportasi dengan jenis tidak diketahui ini berlabuh dipantai");
    }
}
