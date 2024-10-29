import java.util.Scanner;

public class PencarianMenu08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Burger", "Susu", "Batagor", "Siomay", "Pocari"};

        System.out.println("Daftar menu yang tersedia: ");
        for(int i = 0; i<menu.length; i++) {
            System.out.println((i+1) + " . "+ menu[i]);
        }
        System.out.print("Masukkan nama makanan/minuman yang dicari: ");
        String cari = input.nextLine();

        int posisi = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].toLowerCase().equals(cari.toLowerCase())) {
                posisi = i;
                break;
            }
        }
        System.out.println("Hasil Pencarian:");
        if (posisi != -1) {
            System.out.println("Menu '" + cari + "' DITEMUKAN di daftar menu nomor " + (posisi+1));
        } else {
            System.out.println("Maaf, menu '" + cari + "' TIDAK DITEMUKAN dalam daftar menu");
        }
    }
}