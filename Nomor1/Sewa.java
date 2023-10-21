package SalonCantika;

public class Sewa {
    public static double hitungHargaSewa(int pilihanSewa, int jumlahJam) {
        double harga = 0;
        if (pilihanSewa == 1) {
            harga = 100000;
        } else if (pilihanSewa == 2) {
            harga = 250000;
        } else if (pilihanSewa == 3) {
            if (jumlahJam == 1) {
                harga = 150000;
            } else if (jumlahJam == 2) {
                harga = 350000;
            }
        } else if (pilihanSewa == 4) {
            if (jumlahJam == 1) {
                harga = 20000;
            } else if (jumlahJam == 2) {
                harga = 50000;
            }
        }
        return harga;
    }

    public static double hitungTotalSewa(int pilihanSewa, int jumlahJam) {
        double hargaSewa = hitungHargaSewa(pilihanSewa, jumlahJam);
        return hargaSewa * jumlahJam;
    }
}
