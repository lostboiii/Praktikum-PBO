/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewanoop1;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
   
       DaftarGaji daftarGaji = new DaftarGaji(3);
       


       Dosen dosen1 = new Dosen("D001", "Charlie", "Yogyakarta");
       Dosen dosen2 = new Dosen("D002", "Asep", "Yogyakarta");
       Dosen dosen3 = new Dosen("D003", "Boi", "Yogyakarta");
       dosen1.setSKS(12); 
       dosen2.setSKS(12);
       dosen3.setSKS(12);

       daftarGaji.addPegawai(dosen3);
       daftarGaji.addPegawai(dosen2);
       daftarGaji.addPegawai(dosen1);

       
       daftarGaji.printSemuaGaji();
    }
}
