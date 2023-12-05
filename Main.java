import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, golongan, pendidikan;
        int jamKerja;

        do {
            System.out.println("=================================================");
            System.out.println("\tPRORGAM MENGHITUNG GAJI KARYAWAN");
            System.out.println("=================================================");

            System.out.print("Nama Karyawan: ");
            nama = scanner.nextLine();

            System.out.println("Golongan: ");
            System.out.print("1. Golongan 1\n2. Golongan 2\n3. Golongan 3\nMasukkan Pilihan Anda: ");
            golongan = scanner.nextLine();

            System.out.println("Pendidikan: ");
            System.out.print("1. SMU\n2. D3\n3. S1\nMasukkan Pilihan Anda: ");
            pendidikan = scanner.nextLine();

            System.out.print("Jumlah Jam Kerja: ");
            jamKerja = scanner.nextInt();

            Gajikaryawan karyawan = new Gajikaryawan(nama, golongan, pendidikan, jamKerja);
            karyawan.tampilkanData();

            System.out.println("Apakah Anda ingin Mengisi Ulang Kembali? (Y/N)");
            scanner.nextLine();
        } while (scanner.nextLine().equalsIgnoreCase("Y"));

        scanner.close();
    }
}
