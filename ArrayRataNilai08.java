import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahsiswa = 0;
        System.out.print("Masukkan jumlah siswa: ");
        jumlahsiswa = input.nextInt();
        int[] nilaiMhs = new int[jumlahsiswa];
        double total = 0;
        double ratarata;
        int siswalulus= 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = input.nextInt();

        }
        for (int i = 0; i <nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                siswalulus += 1;
            }

        }
        ratarata = total / nilaiMhs.length;
        System.out.println("Rata-rata = " + ratarata);
        System.out.println("Mahasiswa nilai > 70 sebanyak: " + siswalulus);
    }
    
}
