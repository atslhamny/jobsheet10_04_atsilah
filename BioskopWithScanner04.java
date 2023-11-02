import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris;
        int kolom;
        String nama;
        String next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama: ");
            nama = input.nextLine();
            System.out.print("Masukkan Baris: ");
            baris = input.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = input.nextInt();
            input.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? Ya/Tidak: ");
            next = input.nextLine();
            if (next.equalsIgnoreCase("Tidak")) {
                break;
            }
        }
    }
}
