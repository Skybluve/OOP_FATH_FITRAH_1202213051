public class MainApp {
        public static void main(String[] args) {
        // pembuatan objek Perangkat dari class Perangkat
        Perangkat p = new Perangkat("Seagate ", 8, 2.40f);
        p.informasi();
        // pembuatan objek Laptop dari class Laptop
        Laptop l = new Laptop("Asus", 3, 2.20f, true);
        l.informasi();
        l.bukaGame("PUBG");
        l.kirimEmail("fitrahar@student.telkomuniversity.ac.id");
        l.kirimEmail("fitrahramdhan11@gmail.com", " fitrah123@gmail.com ");
        // pembuatan objek Handphone dari class Handphone
        Handphone h = new Handphone(    "Apple", 8, 2.40f);
        h.informasi();
        h.telfon(123456789);
        h.kirimSMS(123456789);
        h.kirimSMS(123456789, 987654321);
        
            

            
       

       
       

        }

}