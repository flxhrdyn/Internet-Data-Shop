import java.util.Scanner;

public class Kuota {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.tampilkanMenu();
    }
}

class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void tampilkanMenu() {
        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("====KUOTA====");
            System.out.println("1. Paket 1GB");
            System.out.println("2. Paket 3GB");
            System.out.println("3. Paket 15GB");
            System.out.println("0. Keluar");
            System.out.print("Silahkan pilih menu : ");

            pilihan = scanner.nextInt();

            scanner.nextLine();

            prosesPilihanMenu(pilihan);
        }

        scanner.close();
        System.out.println("Terima kasih telah menggunakan layanan kami!\n");
    }

    private void prosesPilihanMenu(int pilihan) {
        switch (pilihan) {
            case 1:
                System.out.println("\nAnda memilih paket 1GB");
                System.out.println("Total pembayarannya adalah Rp 15000");
                System.out.print("\nMasukkan uang anda : Rp ");
                int uang1 = scanner.nextInt();
                hitungKembalian(uang1, 15000);
                break;

            case 2:
                System.out.println("\nAnda memilih paket 3GB");
                System.out.println("Total pembayarannya adalah Rp 30000");
                System.out.print("\nMasukkan uang anda : Rp ");
                int uang2 = scanner.nextInt();
                hitungKembalian(uang2, 30000);
                break;

            case 3:
                System.out.println("\nAnda memilih paket 15GB");
                System.out.println("Total pembayarannya adalah Rp 70000");
                System.out.print("\nMasukkan uang anda : Rp ");
                int uang3 = scanner.nextInt();
                hitungKembalian(uang3, 70000);
                break;

            case 0:
                System.out.println("Keluar dari program...");
                break;

            default:
                System.out.println("Pilihan anda tidak valid!!!");
        }
    }

    private void hitungKembalian(int uang, int totalPembayaran) {
        if (uang < totalPembayaran) {
            System.out.println("Uang anda kurang!");
        } else {
            int kembalian = uang - totalPembayaran;
            System.out.println("Kembalian anda adalah : Rp " + kembalian);
        }
        System.out.println();
    }
}
