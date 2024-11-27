/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Koperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        Scanner sc = new Scanner(System.in);
        boolean lop = true;
        do {
            System.out.println("Pilih menus:");
            System.out.println("1.pinjam");
            System.out.println("2.angsur");
            System.out.println("3. lihat jumlah pinjaman");
            System.out.println("4.keluar");
            int pilihan = sc.nextInt();
        
       
        switch (pilihan) {
            case 1:
                System.out.print("Jumlah yang ingin dipinjam: ");
                int jml = sc.nextInt();
                donny.pinjam(jml);
                break;
            case 2:
                System.out.print("Jumlah yang ingin dibayar: ");
                int angsuran = sc.nextInt();
                donny.angsur(angsuran);
                break;
                case 3:
                System.out.println("Jumlah Pinjaman: " + donny.getJumlahp());
                break;
            case 4:
            lop = false;
                System.out.println("Terima kasih telah menggunakan program koperasi ini.");
                return;
            default:
                System.out.println("Pilihan menu yang anda masukkan salah.");
        }
    } while (lop);
        //SOAL 1
        // System.out.println("Nama Anggota: " + donny.getNama());
        // System.out.println("Limit Pinjaman: " + donny.getLimitp());
        // System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahp());

        // System.out.println("\nMeminjam uang 10.000.000...");
        // donny.pinjam(10000000);
        // System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahp());

        // System.out.println("\nMeminjam uang 4.000.000...");
        // donny.pinjam(4000000);
        // System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahp());

        // System.out.println("\nMembayar angsuran 1.000.000...");
        // donny.angsur(1);
        // System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahp());

        // System.out.println("\nMembayar angsuran 3.000.000...");
        // donny.angsur(3000000);
        // System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahp());
    }
}
