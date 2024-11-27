/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Komputer {
    String sistemOP;
    int memori;

    public Komputer(String sistemOP, int memori) {
        this.sistemOP = sistemOP;
        this.memori = memori;
    }
    
    public void setSistemOP(String newVal){
    sistemOP = newVal;
    }
    public void setMemori(int newVal){
    memori = newVal;
    }
    
    public void info(){
        System.out.println("Sistem Operasi :" +sistemOP);
        System.out.println("Memori : "+ memori);
    }
}
