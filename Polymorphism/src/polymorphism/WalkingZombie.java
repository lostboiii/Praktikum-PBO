package polymorphism;

/**
 * WalkingZombie
 */
public class WalkingZombie extends Zombie{
    WalkingZombie(int health,int level){
    super(health, level);
    }
    @Override
    public void heal(){
        System.out.println("WalkingZombie healing...");
        if (this.level == 1) {
            this.health += health * 0.20; 
        } else if (this.level == 2) {
            this.health += health * 0.30; 
        } else if (this.level == 3) {
            this.health += health * 0.40;
        }
    }
    @Override
    public String getZombieInfo(){
        return "Walking Zombie Data ="+"\n"+" Health: " + this.health + "\n"+"Level: " + this.level;
    }
    @Override
    public void destroyed(){
        health -= health * 0.19; 
    }
}