import java.util.ArrayList;
import java.util.Scanner;

class MataKuliah {
    String kodeMK, namaMK;
    int sks;

    MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }
}

class Mahasiswa {
    String nama, nim;
    ArrayList<MataKuliah> daftarKRS = new ArrayList<>();

    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    int getTotalSKS() {
        int total = 0;
        for (MataKuliah mk : daftarKRS) {
            total += mk.sks;
        }
        return total;
    }
}

public class SistemPemantauanKRS {
    static ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS");
            System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Menangkap newline

            switch (pilihan) {
                case 1 -> tambahDataKRS();
                case 2 -> tampilkanDaftarKRS();
                case 3 -> analisisDataKRS();
                case 4 -> System.out.println("Terima kasih!");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }

    static void tambahDataKRS() {
        System.out.println("\n--- Tambah Data KRS ---");
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        Mahasiswa mahasiswa = cariMahasiswa(nim);
        if (mahasiswa == null) {
            mahasiswa = new Mahasiswa(nama, nim);
            dataMahasiswa.add(mahasiswa);
        }

        boolean tambah = true;
        while (tambah) {
            System.out.print("Kode Mata Kuliah: ");
            String kodeMK = scanner.nextLine();
            System.out.print("Nama Mata Kuliah: ");
            String namaMK = scanner.nextLine();
            int sks;
            do {
                System.out.print("Jumlah SKS (1-3): ");
                sks = scanner.nextInt();
                scanner.nextLine(); // Menangkap newline
                if (sks < 1 || sks > 3) {
                    System.out.println("Jumlah SKS tidak valid! SKS harus antara 1 dan 3.");
                }
            } while (sks < 1 || sks > 3);

            mahasiswa.daftarKRS.add(new MataKuliah(kodeMK, namaMK, sks));
            System.out.println("Data mata kuliah berhasil ditambahkan.");
            
            
            System.out.print("Tambah mata kuliah lain? (y/t): ");
            tambah = scanner.nextLine().equalsIgnoreCase("y");
        }
        System.out.println("Total SKS yang diambil: " + mahasiswa.getTotalSKS());
    }

    static void tampilkanDaftarKRS() {
        System.out.println("\n--- Tampilkan Daftar KRS Mahasiswa ---");
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        Mahasiswa mahasiswa = cariMahasiswa(nim);
        if (mahasiswa != null) {
            System.out.println("\nDaftar KRS:");
            System.out.println("NIM   : " + mahasiswa.nim);
            System.out.println("Nama  : " + mahasiswa.nama);
            System.out.println("Kode MK\tNama Mata Kuliah\tSKS");
            for (MataKuliah mk : mahasiswa.daftarKRS) {
                System.out.println(mk.kodeMK + "\t" + mk.namaMK + "\t\t" + mk.sks);
            }
            System.out.println("Total SKS: " + mahasiswa.getTotalSKS());
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    static void analisisDataKRS() {
        System.out.println("\n--- Analisis Data KRS ---");
        int count = 0;
        for (Mahasiswa mhs : dataMahasiswa) {
            if (mhs.getTotalSKS() < 20) {
                count++;
            }
        }
        System.out.println("Jumlah mahasiswa yang mengambil SKS kurang dari 20: " + count);
    }

    static Mahasiswa cariMahasiswa(String nim) {
        for (Mahasiswa mhs : dataMahasiswa) {
            if (mhs.nim.equals(nim)) {
                return mhs;
            }
        }
        return null;
    }
}
