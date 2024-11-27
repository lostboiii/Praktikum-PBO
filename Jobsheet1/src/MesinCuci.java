/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class MesinCuci {
    String merk;
    int kapasitas;

    public MesinCuci(String merk, int kapasitas) {
        this.merk = merk;
        this.kapasitas = kapasitas;
    }
    
    public void setMerk(String newValue){
    merk = newValue;
    }
    public void setKapasitas(int newValue){
    kapasitas = newValue;
    }
    public void info(){
        System.out.println("Merk : "+ merk);
        System.out.println("Kapasitas : "+ kapasitas + "Kg");
    }
   
}
