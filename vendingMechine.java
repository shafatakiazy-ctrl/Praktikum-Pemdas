import java.text.DecimalFormat;
import java.util.Scanner;

public class vendingMechine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Data barang
        String[] kodeBarang = {"A", "B", "C"};
        String[] namaBarang = {"susu", "snack", "air mineral"};
        double[] hargaBarang = {7500, 10000, 6500};
        int[] stokBarang = {3, 4, 1};
        
        // Input dari pengguna
        String kode = in.nextLine();
        int jumlah = in.nextInt();
        double uang = in.nextDouble();
        
        // Cek jumlah barang
        if (jumlah <= 0) {
            System.out.println("Anda tidak melakukan pembelian apapun");
            return;
        }
        
        // Cari index barang berdasarkan kode
        int index = -1;
        for (int i = 0; i < kodeBarang.length; i++) {
            if (kodeBarang[i].equals(kode)) {
                index = i;
                break;
            }
        }
        
        // Cek kode barang valid
        if (index == -1) {
            System.out.println("Kode barang tidak valid");
            return;
        }
        
        // Cek stok
        if (jumlah > stokBarang[index]) {
            System.out.println("Stok tidak mencukupi");
            return;
        }
        
        // Hitung total harga
        double totalHarga = hargaBarang[index] * jumlah;
        
        // Cek uang cukup
        if (uang < totalHarga) {
            System.out.println("Uang anda tidak cukup");
            return;
        }
        
        // Hitung kembalian
        double kembalian = uang - totalHarga;
        
        // Format kembalian dengan pemisah ribuan
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String kembalianFormatted = df.format(kembalian);
        
        // Output hasil pembelian
        System.out.println("Kamu sudah beli " + namaBarang[index] + 
                          ", dan mendapat kembalian sejumlah Rp" + kembalianFormatted);
        
        in.close();
    }
}
