import java.util.Scanner;

public class Tugas1 {
    // Fungsi Rekursif
    static String derDesRekursif(int n) {
        if (n >= 0) {
            return n + " " + derDesRekursif(n - 1);
        } else {
            return " ";
        }
    }

    // Fungsi Iteratif
    static String derDesIteratif(int n) {
        String hasil = " ";
        for (int i = n; i >= 0; i--) {
            hasil = hasil + i + " ";
        }
        return hasil;
    }

    // Fungsi Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        //  Memanggil fungsi Rekursif
        System.out.println("Deret Descending Rekursif : " + derDesRekursif(n));

        //  Memanggil fungsi Iteratif
        System.out.println("Deret Descending Iteratif : " + derDesIteratif(n));
    }
}
