package polymorphism;

/**
 * Barrier
 */
public class Barrier implements Destroyable {

    private int strength;
    
    public Barrier(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
       return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void destroyed() {
        strength -= strength*0.1;
        
    }
    public String getBarrierInfo() {
        return "\nBarrier strength= " + strength;
    }
}