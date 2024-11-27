/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classrelation;

/**
 *
 * @author USER
 */
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan() {
    }

    public Pelanggan(String nama, Mobil mobil, Sopir sopir, int hari) {
        this.nama = nama;
        this.mobil = mobil;
        this.sopir = sopir;
        this.hari = hari;
    }

    public String getNama() {
        return nama;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public int getHari() {
        return hari;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    
    public int hitungTotal(){
        return sopir.hitungBiaya(hari)+mobil.hitungBiaya(hari);
    }
    void info(){
        System.out.println("Nama Pelanggan :"+getNama());
        System.out.println("Nama Sopir :"+sopir.getNama());
        System.out.println("Nama Mobil :"+mobil.getNama());
        System.out.println("Lama Hari :"+getHari());
        System.out.println("Total Sewa :"+hitungTotal());
    }
}
