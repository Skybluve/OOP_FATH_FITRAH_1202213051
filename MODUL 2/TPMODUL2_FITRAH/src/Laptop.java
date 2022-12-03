public class Laptop extends Perangkat{
    protected boolean webcam;

public Laptop(String drive, int ram, float processor, boolean webcam){
    super(drive, ram, processor);
    this.webcam = webcam;
    
}
public void informasi(){
    super.informasi();
    System.out.println("Perangkat tidak diketahui ini memiliki tipe "+ drive + " dan memiliki ram sebesar "+ ram +" GB"+ " serta kecepatan processor "+ processor+" Ghz");
    System.out.println("=================================================================================================================================================");
    System.out.println("Laptop ini memiliki drive tipe " + drive);
    System.out.println("Laptop ini memiliki RAM sebesar " + ram + " GB");
    System.out.println("Laptop ini memiliki Processor sebesar " + processor + " GHz");
    System.out.println("Selain itu Laptop ini juga memiliki Webcam  " );
    System.out.println("==================================================================================================================================================");
}
public void bukaGame(String nama_game){
    System.out.println("Laptop Berhasil Membuka game " + nama_game);
}
public void kirimEmail(String email){
    System.out.println("Laptop Berhasil Mengirim email ke " + email);
}
public void kirimEmail(String email1, String email2){
    System.out.println("Laptop Berhasil Mengirim email ke " + email1 + " dan " + email2);
    System.out.println("");    
}
}
