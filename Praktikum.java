import java.util.Scanner;
public class Praktikum{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);{
        String nama, kelurahan;
        int kwhawal, kwhakhir;
        int beban;
        int ppj;
        int akhirPpj;
        int biaya;
        int pemakaian;
        System.out.print("masukkan nama:");
        nama = input.nextLine();
        System.out.print("kelurahan:");
        kelurahan = input.nextLine();
        System.out.print("masukkan posisi awal kwh meter :");
        kwhawal = input.nextInt();
        System.out.print("masukkan posisi akhir kwh meter :");
        kwhakhir = input.nextInt();
        System.out.print("masukkan biaya beban saat ini :");
        beban = input.nextInt();
        System.out.print("masukkan pjj (dalam persen) :");
        ppj = input.nextInt();
        pemakaian = kwhakhir - kwhawal;
        biaya = (kwhakhir-kwhawal)*beban;
        akhirPpj = (biaya*ppj)/100;
        System.out.println("======================PLN "+kelurahan+"======================");
        System.out.println("nama                     : "+ nama );
        System.out.println("kelurahan                : "+ kelurahan);
        System.out.println("pemakaian bulan ini      : "+ pemakaian + "kwh meter");
        System.out.println("tarif listrik            : Rp" + akhirPpj + ",-");
        System.out.println("ppj " + ppj + "%                  : Rp" + akhirPpj + ",-");
        System.out.println("total bayar              : Rp" + (biaya+akhirPpj) + ",-");
        System.out.println("===========================================================");
        input.close();
      }

    }

}
   