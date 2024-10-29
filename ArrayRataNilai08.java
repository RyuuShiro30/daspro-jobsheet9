import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double ratarata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = input.nextInt();

        }
        for (int i = 0; i <nilaiMhs.length; i++) {
            total += nilaiMhs[i];

        }
        ratarata = total / nilaiMhs.length;
        System.out.print("Rata-rata = " + ratarata);
    }
    
}
