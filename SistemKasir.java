import java.util.Scanner;

public class SistemKasir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mendeklarasikan array barang
        String[] barang = {"Beras", "Minyak Goreng", "Gula Pasir", "Garam"};

        // Mendeklarasikan array harga
        int[] harga = {20000, 15000, 10000, 5000};

        // Menampilkan daftar barang
        System.out.println("Daftar Barang:");
        for (int i = 0; i < barang.length; i++) {
            System.out.println(i + 1 + ". " + barang[i] + " - Rp" + harga[i]);
        }

        // Meminta input pengguna
        System.out.print("Pilih barang (1-" + barang.length + "): ");
        int pilihan = scanner.nextInt();

        // Validasi pilihan barang
        if (pilihan < 1 || pilihan > barang.length) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        // Menghitung total harga
        int index = pilihan - 1;
        int totalHarga = harga[index];

        // Menampilkan total harga
        System.out.println("Total harga: Rp" + totalHarga);

        // Meminta input pembayaran
        System.out.print("Masukkan jumlah uang: ");
        int uang = scanner.nextInt();

        // Menghitung kembalian
        int kembalian = uang - totalHarga;

        // Menampilkan kembalian
        System.out.println("Kembalian: Rp" + kembalian);
    }
}
