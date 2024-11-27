/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Laptop extends Komputer {
    String baterai,jenisWIFI;
    
    public Laptop(String sistemOP, int memori,String baterai, String jenisWIFI) {
        super(sistemOP,memori);
        this.baterai = baterai;
        this.jenisWIFI = jenisWIFI;
    }
    
    public void setBaterai(String newVal){
    baterai = newVal;
    }
    public void setWifi(String newVal){
    jenisWIFI = newVal;
    }
    
    public void info(){
        super.info();
        System.out.println(" Baterai:"+baterai + "Wh");
        System.out.println("Jenis Wifi :" + jenisWIFI);
    }
    
}
