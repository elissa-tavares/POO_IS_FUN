package poo_tamagotchi;

public class Pet{
    private final int ENERGY_MAX, HUNGRY_MAX, CLEAR_MAX;
    private int energy, hungry, clean;
    private int diamonds;
    private int age;
    private boolean alive;

    public Pet(int ENERGY_MAX, int HUNGRY_MAX, int CLEAR_MAX){
        this.ENERGY_MAX = ENERGY_MAX;
        this.HUNGRY_MAX = HUNGRY_MAX;
        this.CLEAR_MAX = CLEAR_MAX;
        this.diamonds = 0;
        this.age = 0;
    }

    @Override
    public String toString(){
        return "E:" + energy + "/" + ENERGY_MAX + ", "
        +  "S:" + hungry + "/" + HUNGRY_MAX + ", "
        +  "L:" + clean + "/" + CLEAR_MAX + ", "
        +  "D:" + diamonds + ", " + "I:"  + age;
    }

    void setEnergy(int value){
        if(value <= 0){
            energy = 0;
            System.out.println("fail: pet morreu de fraqueza");
            alive = false;
            return;
        } 
        value = Math.min(ENERGY_MAX, value);
    }


    public void setHungry(int value){
    }
    
    void setClean(int value){
    }

    private boolean testAlive(){
        alive = energy != 0 && diamonds != 0 && hungry != 0;
        return alive;
    }


    public void play(){
        if(!testAlive())
            return;
        setEnergy(getEnergy() - 2);
        setHungry(getHungry() - 1);
        setClean(getClean() - 3);
        diamonds += 1;
        age += 1;
    }
    public void shower(){
    }

    public void eat(){
    }

    public void sleep(){
    }


    int getClean(){
        return clean;
    }
    int getHungry(){
        return hungry;
    }
    int getEnergy(){
        return energy;
    }
}
