import java.util.Scanner;

public class Percobaan2_12 {
    // Fungsi hitungPangkat
    static int hitungPangkat(int x, int y){
        if (y == 1) {
            System.out.print(x);
            return (1);
        } else {
            System.out.print(x + "x");
            return (x * hitungPangkat(x, y - 1));
        }
    }

    // Fungsi Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung : ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        int pangkat = sc.nextInt();

        //  pemanggilan fungsi hitungPangkat
        int hasil = hitungPangkat(bilangan, pangkat);

        // Print deret perhitungan pangkat
        System.out.print(" = " + hasil);
    }
}
