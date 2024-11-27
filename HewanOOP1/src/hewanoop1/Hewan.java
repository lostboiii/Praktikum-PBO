/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewanoop1;

/**
 *
 * @author USER
 */
public class Hewan {

    /**
     * @param args the command line arguments
     */
    private String nama;
    protected int umumr;

    public Hewan(String nama, int umumr) {
        this.nama = nama;
        this.umumr = umumr;
        System.out.println("kons hewan dipanggil");
    }
 
    void suara(){
        System.out.println("Suara hewan..");
    }
    void ingfo(){
        System.out.println("Nama :"+nama);
        System.out.println("Umur :"+umumr);
    }
    
}
