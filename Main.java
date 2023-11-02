import java.util.Scanner;

class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungKemiringan() {
        return Math.sqrt(alas * alas + tinggi * tinggi);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan panjang tinggi segitiga: ");
        double tinggi = input.nextDouble();

        Segitiga segitiga = new Segitiga(alas, tinggi);

        double kemiringan = segitiga.hitungKemiringan();

        System.out.println("Kemiringan segitiga adalah: " + kemiringan);
    }
}
