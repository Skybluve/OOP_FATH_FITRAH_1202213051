package src;
public class Sampan {
// Terdapat 1 variable protected yaitu layar(int)
protected int layar;
// Terdapat 1 Constructor Sampan(int jumlahKursi, int biaya, int layar)
public Sampan(int jumlahKursi, int biaya, int layar) {
    this.jumlahKursi = jumlahKursi;
    this.biaya = biaya;
    this.layar = layar;
}
// Terdapat 4 Method public yaitu informasi(), berlayar(), berlabuh(), berlabuh(int jangkar)
public void informasi() {
    System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp." + biaya);
}
public void berlayar() {
    System.out.println("Transportasi Air jenis Sampan sedang berlayar dengan kecepatan menggunakan " + layar+ " layar");
    }
public void berlabuh() {
    System.out.println("Transportasi Air jenis Sampan berlabuh dipantai tanpa jangkar");
    }
public void berlabuh(int jangkar) {
    System.out.println("Transportasi Air jenis Sampan berlabuh dipantai dengan  " + jangkar + " jangkar");
    }

}
    