package polymorphism;

public class Plant {
    public void doDestroy(Destroyable d) {
        if(d instanceof WalkingZombie)
            d.destroyed();
        else if(d instanceof JumpingZombie)
            d.destroyed();
         else if(d instanceof Barrier)
            d.destroyed();
    }

   
}
