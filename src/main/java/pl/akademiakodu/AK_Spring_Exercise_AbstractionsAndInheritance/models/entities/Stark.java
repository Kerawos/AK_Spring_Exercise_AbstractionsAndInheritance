package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritance.models.entities;

public abstract class Stark extends Human implements HouseMotto{

    public Stark() {
        super(House.STARK);
    }

    @Override
    public String getMotto(){
        return "Winter is comming";
    }
}
