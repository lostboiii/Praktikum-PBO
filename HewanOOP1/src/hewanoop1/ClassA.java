/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewanoop1;

/**
 *
 * @author USER
 */
public class ClassA {
    // Fields
    protected int x, y;  // Changed to protected to allow access in subclass
    
    // Setters for x and y
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    // Method to print x and y
    public void getNilai(){
        System.out.println("Nilai X :" + x);
        System.out.println("Nilai Y :" + y);
    }
}