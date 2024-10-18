/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS;

/**
 *
 * @author USER
 */
public class UTS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Komputer komputer = new Komputer("Asus", 2000, 1024, "Intel Core i5");
        komputer.tampil();
        Pc pc  = new Pc(komputer.merk, komputer.kecProsesor, komputer.sizeMemory, komputer.jnsProcessor, 15);
        pc.tampilPc();
        Leptop leptop = new Leptop("Li-ion", komputer.merk, komputer.kecProsesor, komputer.sizeMemory, komputer.jnsProcessor);
        leptop.tampilLeptop();
        Mac mac = new Mac("Li-ion", komputer.merk, komputer.kecProsesor, komputer.sizeMemory, komputer.jnsProcessor, "Security aman coy");
        mac.tampilMac();
        Windows windows = new Windows("Li-ion", komputer.merk, komputer.kecProsesor, komputer.sizeMemory, komputer.jnsProcessor, "Windows 10");
        windows.tampilWindows();
    }
    
}
