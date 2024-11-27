/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Desktop extends Komputer {
    String dayaListrik,merkMonitor;
    
    public Desktop(String sistemOP, int memori,String dayaListrik, String merkMonitor) {
        super(sistemOP,memori);
        this.dayaListrik = dayaListrik;
        this.merkMonitor = merkMonitor;
    }
    
    public void setListrik(String newVal){
    dayaListrik = newVal;
    }
    public void setMonitor(String newVal){
    merkMonitor = newVal;
    }
    
    public void info(){
        super.info();
        System.out.println(" Daya Listrik:"+dayaListrik + "Watt");
        System.out.println("Merk Monitor :" + merkMonitor);
    }
}
