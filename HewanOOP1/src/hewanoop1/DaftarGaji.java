/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewanoop1;

/**
 *
 * @author USER
 */
public class DaftarGaji {
    private Pegawai[] listPegawai; 
    private int index = 0;          

    
    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
    }

    public void addPegawai(Pegawai pegawai) {
        if (index < listPegawai.length) {
            listPegawai[index] = pegawai;
            index++;
        } else {
            System.out.println("The list is full. Cannot add more employees.");
        }
    }
    public void printSemuaGaji() {
        for (int i = 0; i < index; i++) {
            Pegawai p = listPegawai[i];
            System.out.println("Name: " + p.getNama() + ", Gaji: " + p.getGaji());
        }
    }
}
