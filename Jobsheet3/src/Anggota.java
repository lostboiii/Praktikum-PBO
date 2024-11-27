/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Anggota {
    private String ktp,nama;
    private int limitp,jumlahp;

    public Anggota(String ktp, String nama, int limitp) {
        this.ktp = ktp;
        this.nama = nama;
        this.limitp = limitp;
        this.jumlahp = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitp() {
        return limitp;
    }

    public int getJumlahp() {
        return jumlahp;
    } public void pinjam(int jumlah) {
        if ((jumlahp + jumlah) <= limitp) {
            jumlahp += jumlah;
            System.out.println("Sukses");
        } else {
            System.out.println("Pinjaman melebihi limit!");
        }
    }

    public void angsur(int jumlah) {
        int minimal = (int) (jumlahp*0.1);
        if (jumlah <= jumlahp) {
            if (jumlah >= minimal) {
                jumlahp -= jumlah;
            }
            else{
                System.out.println("angsuran minimal 10%");
            }
        } else {
            System.out.println("Angsuran melebihi jumlah pinjaman!");
        }
    }
}
