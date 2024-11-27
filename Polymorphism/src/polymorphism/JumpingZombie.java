package polymorphism;

public class JumpingZombie extends Zombie{
    JumpingZombie(int health,int level){
        super(health,level);
    }

    @Override
    public void destroyed() {
        health -= health * 0.091; 
    }
    public void heal(){
        System.out.println("Jumping Zombie healed!");
        if (this.level == 1) {
            this.health += health * 0.30;
        } else if (this.level == 2) {
            this.health += health * 0.40; 
        } else if (this.level == 3) {
            this.health += health * 0.50; 
        }
    }
    @Override
    public String getZombieInfo(){
        return "Jumping Zombie Data ="+"\n"+" Health: " + this.health + "\n"+"Level: " + this.level;
    }
}
