/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Demo {
    public static void main(String[] args) {
        MesinCuci m1 = new MesinCuci("Samsung",30);
        Motor mo1 = new Motor("Honda Vario", 150);
        Komputer k1 = new Komputer("Windows",8);
        Desktop d1 = new Desktop("Windows",8,"450","LG");
        Laptop l1 = new Laptop("Windows",8,"50","Wifi-5");
        m1.info();
        mo1.info();
        k1.info();
        d1.info();
        l1.info();
    }
}
