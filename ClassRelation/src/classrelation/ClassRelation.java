/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classrelation;

/**
 *
 * @author USER
 */
public class ClassRelation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Processor p = new Processor();
        p.setMerk("I5");
        p.setCache(3);
        Laptop l = new Laptop("leptop",p);
        l.info();
        //p2
        Sopir s = new Sopir("Asep", 100);
        Mobil m = new Mobil("anu", 100);
        Pelanggan p1 = new Pelanggan("daw", m, s, 5);
        p1.hitungTotal();
        p1.info();
    }
    
}
