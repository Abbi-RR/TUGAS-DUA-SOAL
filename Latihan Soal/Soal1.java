import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int i;
        int nilaiAwal, nilaiAkhir;

        Scanner in = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Masukkan Nilai Awal: ");
        System.out.println("------------------------");
        nilaiAwal = in.nextInt();
        System.out.println("-------------------------");
        System.out.println("Masukkan Nilai Akhir: ");
        System.out.println("-------------------------");
        nilaiAkhir = in.nextInt();
        i = nilaiAwal;
        while (i <= nilaiAkhir) {

            i++;
            if (i % 6 == 0) {
                System.out.println(i);
            }

        }
        in.close();

    }

}
    