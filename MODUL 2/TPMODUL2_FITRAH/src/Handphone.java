public class Handphone extends Perangkat{
    public Handphone (String drive , int ram , float processor){
        super(drive, ram, processor);
        System.out.println("Handphone ini memiliki tipe "+ drive + " dan memiliki ram sebesar "+ram+"serta kecepatan processor "+ processor+"Ghz");
        System.out.println("Handphone ini tidak memiliki fitur fingerprint");
    }
    public void telfon(int no_hp){
        System.out.println("Handphone ini berhasil Menelepon nomor " + no_hp);
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone ini berhasil Mengirim SMS ke nomor " + no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone ini berhasil Mengirim SMS ke nomor " + no_hp1 + " dan " + no_hp2);
    }
    public void informasi(){
        super.informasi();
        System.out.println("====================================================================");
    }
    
}
