/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewanoop1;

/**
 *
 * @author USER
 */
public class Kucing extends Mamalia{
    private String bulu;

    public Kucing(String bulu, String nama, int umumr) {
        super(nama, umumr);
        this.bulu = bulu;
        System.out.println("kons kucing dipanggil dengan ras");
    }

  
    void meong(){
        System.out.println("Meng");
    }
    
    @Override
   void suara(){
       System.out.println("Bruh");
   }
    @Override
   void ingfo(){
       super.ingfo();
        System.out.println("Bulu :"+bulu);
    }
}
