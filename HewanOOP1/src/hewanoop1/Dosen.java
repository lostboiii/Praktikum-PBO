/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewanoop1;

/**
 *
 * @author USER
 */
public class Dosen extends Pegawai{
    private int jumlahSKS,TARIF_SKS = 150000;

    Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.jumlahSKS = 0;
    }
    
    void setSKS(int sks){
        this.jumlahSKS = sks;
    }
    public int getGaji(){
         return this.jumlahSKS*this.TARIF_SKS;
    }
}
