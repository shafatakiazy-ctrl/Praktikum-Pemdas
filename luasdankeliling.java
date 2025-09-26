import java.util.Scanner;
public class luasdankeliling {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("menu :");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.print("masukkan jenis bangun ruang");
        int pilihan = in.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("masukkan panjang");
                int panjang = in.nextInt();
                System.out.print("masukkan lebar");
                int lebar = in.nextInt();
                //proses menghitung
                long kelilingPP = 2*(panjang + lebar);
                long luasPP = (panjang*lebar);
                System.out.println("\nkeliling persegi panjang adalah" + kelilingPP + "cm");
                System.out.println("luas persegi panjang adalah" + luasPP + "cm2");
                break;
            case 2:
                System.out.print("masukkan jari-jari");
                int r = in.nextInt();
                //proses menghitung
                double kelilingLingkaran= 2*(Math.PI)*r;
                double luasLingkaran = (Math.PI)*r*r;
                System.out.println("\nkeliling lingkaran adalah" + kelilingLingkaran + "cm");
                System.out.println("luas lingkaran adalah" + luasLingkaran + "cm2");
                break;
            case 3 :
                System.out.println("masukkan a");
                int a = in.nextInt();
                System.out.println("\nmasukkan b");
                int b = in.nextInt();
                System.out.println("masukkan c");
                int c = in.nextInt();
                //proses menghitung
                long kelilingSegitiga = (a+b+c);
                long luasSegitiga = (a*b)/2;
                System.out.println("\nkeliling segitiga adalah" + kelilingSegitiga + "cm");
                System.out.println("luas segitiga adalah" + luasSegitiga + "cm2");
                break;
            default:
                System.out.println("data tidak valid");

        }
    }
}
