
import java.util.Scanner;
public class tukangParkirVpl{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan durasi parkir dalam menit:");
        int menitParkir = input.nextInt();

        double bayar = 0.0;
        double jam = menitParkir / 60.0;

        // apabila waktu tidak valid
        if (menitParkir <= 0) {
            System.out.println("Misiiii input ga valid nih!!");
            input.close();
            return;
        }

        System.out.println("Masukkan jenis kendaraan:");
        String jenisKendaraan = input.next().toLowerCase();

        // menentukan biaya parkir
        if (jenisKendaraan.equals("motor") || jenisKendaraan.equals("mobil")) {
            // Logika untuk parkir 5 menit pertama (tarif khusus)
            if (menitParkir <= 5) {
                bayar = 3000.0;
            } 
            // biaya awal
            else if (menitParkir <= 120) {
                bayar = 5000.0;
            } 
            // jika lebih dari 2 jam
            else {
                int biayaAwal = 5000;
                double extraMenit = menitParkir - 120;
                int biayaTambahan = (int) Math.ceil(extraMenit / 10.0);

                if (jenisKendaraan.equals("motor")) {
                    bayar = biayaAwal + (biayaTambahan * 1000);
                } else { // jenisKendaraan.equals("mobil")
                    bayar = biayaAwal + (biayaTambahan * 2000);
                }
            }
            System.out.printf("Biaya parkir %s selama %.1f jam adalah Rp %,.2f%n", jenisKendaraan, jam, bayar);

        // jika kendaraan tidak valid
        } else {
            System.out.println("Jalan kaki tidak perlu bayar parkir");
        } 

        input.close();
    }
}