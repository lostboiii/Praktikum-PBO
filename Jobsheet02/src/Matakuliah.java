/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Matakuliah {
     String nama,kode;

    public Matakuliah(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }
    
    public void setNama(String newV){
        this.nama = newV;
    }
    public void setKode(String newV){
        this.kode = newV;
    }
    
    public String getNama(){
    return nama;
    }
    public String getKode(){
    return kode;
    }
}
