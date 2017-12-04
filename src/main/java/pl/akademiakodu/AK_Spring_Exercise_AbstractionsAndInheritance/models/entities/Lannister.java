package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritance.models.entities;

/**
 * First Lannister will be parent for all other Lannisters
 */
public abstract class Lannister extends Human implements HouseMotto {
    public Lannister() {
        super(House.LANNISTER);
    }

    @Override
    public String getMotto(){
        return "Hear me roar!";
    }
}
