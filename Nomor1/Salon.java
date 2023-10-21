package SalonCantika;

import java.util.Scanner;

public class Salon {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nama, noTelepon;
            double totalHarga = 0;

            System.out.print("Masukkan nama: ");
            nama = scanner.nextLine();

            System.out.print("Masukkan nomor telepon: ");
            noTelepon = scanner.nextLine();

            char lanjutkan;
            do {
                System.out.println("Pilihan Menu (Ketik 1/2)");
                System.out.print("1. Perawatan\n2. Penyewaan\nPilihan Anda: ");
                int pilihanMenu = scanner.nextInt();

                if (pilihanMenu == 1) {
                    System.out.println("Menu Perawatan");
                    System.out.println("1. Fasial Wajah");
                    System.out.println("2. Masker");
                    System.out.println("3. Potong Rambut");
                    System.out.print("Pilih jenis perawatan (1/2/3): ");
                    int pilihanPerawatan = scanner.nextInt();
                    System.out.print("Jumlah orang: ");
                    int jumlahOrang = scanner.nextInt();

                    double totalPerawatan = Perawatan.hitungTotalPerawatan(pilihanPerawatan, jumlahOrang);
                    totalHarga += totalPerawatan;
                } else if (pilihanMenu == 2) {
                    System.out.println("Menu Penyewaan");
                    System.out.println("1. Rias Wajah");
                    System.out.println("2. Baju Pengantin");
                    System.out.println("3. Aksesoris");
                    System.out.print("Pilih jenis sewa (1/2/3): ");
                    int pilihanSewa = scanner.nextInt();
                    System.out.print("Jumlah jam sewa: ");
                    int jumlahJam = scanner.nextInt();

                    double totalSewa = Sewa.hitungTotalSewa(pilihanSewa, jumlahJam);
                    totalHarga += totalSewa;
                }

                System.out.print("Ingin input lagi? [Y/T]: ");
                lanjutkan = scanner.next().charAt(0);
            } while (lanjutkan == 'Y' || lanjutkan == 'y');

            System.out.println("Terima kasih, " + nama + "!");
            System.out.println("Total yang harus dibayar: " + totalHarga);
        }
    }
}
