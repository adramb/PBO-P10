package SalonCantika;

import java.util.Scanner;

public class Perawatan {
    public static double hitungHargaPerawatan(int pilihanPerawatan, int jumlahOrang) {
        double harga = 0;
        if (pilihanPerawatan == 1) {
            harga = 50000;
        } else if (pilihanPerawatan == 2) {
            harga = 100000;
        } else if (pilihanPerawatan == 3) {
            if (jumlahOrang == 1) {
                harga = 40000;
            } else if (jumlahOrang == 2) {
                harga = 75000;
            }
        } else if (pilihanPerawatan == 4) {
            if (jumlahOrang == 1) {
                harga = 20000;
            } else if (jumlahOrang == 2) {
                harga = 35000;
            }
        }
        return harga;
    }

    public static double hitungTotalPerawatan(int pilihanPerawatan, int jumlahOrang) {
        double hargaPerawatan = hitungHargaPerawatan(pilihanPerawatan, jumlahOrang);
        return hargaPerawatan * jumlahOrang;
    }
}
