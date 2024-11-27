/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Motor {
    String merk;
    int cc;

    public Motor(String merk, int cc) {
        this.merk = merk;
        this.cc = cc;
    }
    
    public void setMerk(String newValue){
    merk = newValue;
    }
    public void setCC(int newValue){
    cc = newValue;
    }
    
    public void info(){
        System.out.println("Merk :"+merk);
        System.out.println("Merk : "+cc + "cc");
    }
}
