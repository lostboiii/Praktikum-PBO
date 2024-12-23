package polymorphism;

abstract class Zombie implements Destroyable {

    protected int health; 
    protected int level; 


    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void destroyed() ;
    public abstract void heal(); 
    public String getZombieInfo() {
        return "Health = " + this.health + "\n"+
                "Level = " + this.level;
    }
    
}

