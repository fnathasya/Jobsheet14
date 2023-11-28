import java.util.Scanner;

public class Percobaan3_12 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun -1));
        }
    }

    // Fungsi Main()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jumlah saldo awal : ");
        double saldoAwal = sc.nextInt();
        System.out.println("Lama investasi (tahun) : ");
        int tahun = sc.nextInt();

        // Pemanggilan fungsi hitungLaba
        System.out.print("Jumlah saldo setelah " + tahun + " tahun :");
        System.out.print(hitungLaba(saldoAwal, tahun));
    }
}
