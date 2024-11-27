/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewanoop1;

/**
 *
 * @author USER
 */
public class ClassB extends ClassA{
        private int z;  // Field for z

        // Constructor for ClassB
        public ClassB(int z) {
            this.z = z;
        }
        
        // Setter for z
        public void setZ(int z) {
            this.z = z;
        }

        // Method to print the value of z
        public void getZ(){
            System.out.println("Nilai Z :" + z);
        }

        // Method to print the sum of x, y, and z
        public void getJum(){
            System.out.println("Jum :" + (x + y + z));
        }
    }

