/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Dosen {
      String nama,id;

    public Dosen(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }
    
    public void setNama(String newV){
        this.nama = newV;
    }
    public void setID(String newV){
        this.id = newV;
    }
    
    public String getNama(){
    return nama;
    }
    public String getID(){
    return id;
    }
}
