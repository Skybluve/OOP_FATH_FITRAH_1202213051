//Implementasikan interface Runnable pada class Calculation

package studikasus;

public class Calculation implements Runnable {
    //Terdapat atribut radius,side, area dengan tipe data double
    private double radius;
    private double side;
    private double area;
    //Terdapat atribut phi dengan tipe data double dengan nilai default = 3.14
    private double phi = 3.14;
    // Terdapat method setter dan getter untuk Square (persegi) yaitu setSquare() dan juga getSquare(). Pada setSquare() diisi dengan rumus luas dari persegi dengansisinya yaitu side dan sebuah exception jika nilai sisinya kurang dari 1 dengan argumen illegal exception dengan menggunakan sebuah kondisi. Kemudian pada getSquare() akan melakukan return luas (area).
    public void setSquare(double side) throws IllegalArgumentException {
        if (side < 1) {
            throw new IllegalArgumentException("Side must be greater than 0");
        }
        this.side = side;
        this.area = side * side;
    }
    public double getSquare() {
        return this.area;
    }
    // Terdapat method setter dan getter untuk CIrcle (lingkaran) yaitu setCircle() dan juga getCircle(). Pada setCircle() diisi dengan rumus luas dari lingkaran dengan nilai π yaitu 3.14 dan jari-jari yaitu radius. Juga sebuah exception jika nilai sisinya kurang dari 1 dengan argumen illegal exception dengan menggunakan sebuah kondisi. Kemudian pada getSquare() akan melakukan return luas (area).
    public void setCircle(double radius) throws IllegalArgumentException {
        if (radius < 1) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;
        this.area = phi * radius * radius;
    }
    public double getCircle() {
        return this.area;
    }
    // Terdapat method setter dan getter untuk Trapezoid (trapesium) yaitu setTrapezoid() dan juga getTrapezoid(). Pada setTrapezoid() diisi dengan rumus luas dari trapesium dengan menambahkan parameter baru yaitu a (sebagai sisi atas), b (sebagai sisi bawah), dan t sebagai tinggi dengan tipe data double. Kemudian menambahkan sebuah exception jika nilai sisinya kurang dari 1 dengan argumen illegal exception dengan menggunakan sebuah kondisi.Kemudian pada getSquare() akan melakukan return luas (area).
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
        if (a < 1 || b < 1 || t < 1) {
            throw new IllegalArgumentException("All sides must be greater than 0");
        }
        this.area = (a + b) * t / 2;
    }
    public double getTrapezoid() {
        return this.area;
    }
    // Terdapat method public void run() yaitu @Override dari interface Runnable Lalu isilah dengan print (program will start in) kemudian perulangan for dengan parameter i dengan value 3 yang nantinya akan berkurang dengan melakukan countdown dari 3 sampai 1 sebelum menunjukkan hasil dari program yang akan dijalankan. Buatlah try-catch dengan mengisi Thread.sleep pada bagian try dan catch isilah dengan default error message.
    @Override
    public void run() {
        System.out.println("Program will start in");
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
} 

