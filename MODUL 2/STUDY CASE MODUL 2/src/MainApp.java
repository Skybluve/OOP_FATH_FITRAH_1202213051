package src;

public class MainApp {
    public static void main(String[] args) {
    //    pembuatan objek dari class TransportasiAir
        TransportasiAir p = new TransportasiAir(4, 20000);
        p.informasi();
    // pembuatan objek dari class sammpan
        Sampan s = new Sampan(20, 50000);
        s.informasi();
        s.berlayar();
        s.berlabuh();
        s.berlabuh(2);
    // pembuatan objek dari class kapal
        Kapal k = new Kapal(50, 100000);
        k.informasi();
        k.berlayar("diesel");
        k.berlayar(10);
        k.berlabuh();
    }
    

}
