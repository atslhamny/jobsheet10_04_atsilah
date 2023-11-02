import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris;
        int kolom;
        String nama;
        String next;

        String[][] penonton = new String[4][2];

        int menu;
        while (true) {
            System.out.println("==========MENU==========");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu Yang Akan Dipilih: ");
            menu = input.nextInt();
            input.nextLine(); // Membersihkan newline karakter setelah nextInt()

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan Nama: ");
                        nama = input.nextLine();

                        // Validasi nomor baris
                        do {
                            System.out.print("Masukkan Baris (1-4): ");
                            baris = input.nextInt();
                        } while (baris < 1 || baris > 4);

                        // Validasi nomor kolom
                        do {
                            System.out.print("Masukkan Kolom (1-2): ");
                            kolom = input.nextInt();
                        } while (kolom < 1 || kolom > 2);

                        input.nextLine(); // Membersihkan newline karakter setelah nextInt()

                        // Periksa apakah kursi sudah terisi
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Maaf, kursi tersebut sudah terisi oleh penonton lain.");
                            continue; // Minta input baris dan kolom lagi
                        }

                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? Ya/Tidak: ");
                        next = input.nextLine();
                        if (next.equalsIgnoreCase("Tidak")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("==========DAFTAR PENONTON==========");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = (penonton[i][j] != null) ? penonton[i][j] : "***";
                            System.out.println("Penonton pada baris ke-" + (i + 1) + " dan kolom ke-" + (j + 1) + ": " + namaPenonton);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
    }
}
