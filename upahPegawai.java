import java.util.Scanner;
public class upahPegawai {
    
    public static void main(String[] args) {
                //konstanta perhitungan
                Scanner in = new Scanner(System.in);
                final int batasKerjaMax = 60;
                final int batasKerjaMin = 50;
                final int upahPerjam = 5000;
                final int upahLembur = 6000;
                final int sanksi = 1000;

                System.out.println("masukkan jam kerja");
                //variabel perhitungan
                int jamKerja = in.nextInt();
                int lembur = 0;
                int upah = 0;
                int total = 0;
                int denda = 0;

                if (jamKerja > batasKerjaMax){
                    int jamLembur = jamKerja - batasKerjaMax;
                    lembur = jamLembur*upahLembur;
                    upah = jamKerja*upahPerjam;
                    total = upah+lembur-denda;
                }
                else if (jamKerja >= batasKerjaMax && jamKerja <= batasKerjaMin){
                    upah = jamKerja*upahPerjam;
                    total = upah+lembur-denda;
                }
                else {
                    upah = jamKerja*upahPerjam;
                    int jamKurang = batasKerjaMin - jamKerja;
                    denda = jamKurang*sanksi;
                    total = upah+lembur-denda;
                }

                System.out.printf("%-12s: %d\n", "Jam Kerja", jamKerja);
                System.out.printf("%-6s= %d\n", "Upah", upah);
                System.out.printf("%-6s= %d\n", "Lembur", lembur);
                System.out.printf("%-6s= %d\n", "Denda", denda);
                System.out.println("----------------");
                System.out.printf("%-6s= %d\n", "Total", total);

    }
}