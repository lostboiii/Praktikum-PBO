/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classrelation;

/**
 *
 * @author USER
 */
public class Sopir {
    private String nama;
    private int biaya;

    public Sopir() {
    }

    public Sopir(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public String getNama() {
        return nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiaya(int hari){
       int total = this.biaya*hari;
       return total;
    }
    
}
