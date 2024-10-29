import java.util.Scanner;

public class Pesanan08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahpesanan = input.nextInt();
        input.nextLine();

        String[] namapesanan = new String[jumlahpesanan];
        int[] hargapemesanan = new int[jumlahpesanan];

        for(int i = 0; i < jumlahpesanan; i++) {
            System.out.println("pesanan ke-" + (i+1));
            System.out.print("nama makanan / minuman: ");
            namapesanan[i] = input.nextLine();

            System.out.print("Harga: Rp. ");
            hargapemesanan[i] = input.nextInt();
            input.nextLine();

        }
        int total = 0;
        for (int harga : hargapemesanan) {
            total += harga;

        }
        System.out.println("No.\tpesanan\t\tharga");

        for (int i = 0; i < jumlahpesanan; i++) {
            System.out.printf("%d\t%s\t\tRp.%,d\n", (i+1), namapesanan[i], hargapemesanan[i]);
    }
    System.out.printf("Total Biaya:\tRp.%,d\n", total);
    }
}
