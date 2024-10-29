import java.util.Scanner;

public class ArrayNilai08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = input.nextInt();
        }

        System.out.println(); 
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Mahasiswa ke-" + i + " ");
            if (nilaiAkhir[i] > 70) {
                System.out.println("lulus!");
            } else {
                System.out.println("tidak lulus!");
            }
        }

        input.close();
    }
}