import java.util.Scanner;

public class Tugas2 {
    
    // Fungsi Rekursif penjumlahan
    static int penjumlahan(int n) {
        if (n == 1) {
            System.out.print(1);
            return 1;
        } else {
            System.out.print(n + " + ");
            return n + penjumlahan(n - 1);
        }
    }

    // Fungsi Main 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        // Memanggil Fungsi Penjumlahan
        int hasil = penjumlahan(n);
        System.out.println(" = " + hasil);
    }
}
