/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewanoop1;

/**
 *
 * @author USER
 */
public class Anjing extends Mamalia{
    private String jenisBulu;

    public Anjing(String jenisBulu, String nama, int umumr) {
        super(nama, umumr);
        this.jenisBulu = jenisBulu;
    }

    public String getJenisBulu() {
        return jenisBulu;
    }
  
 
    void menggonggong(){
        System.out.println("Wuf");
    }
}
