package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritance.models.entities;

public abstract class Targaryen extends Human implements HouseMotto{
    public Targaryen() {
        super(House.TARGARYEN);
    }

    @Override
    public String getMotto() {
        return "Fire and Blood";
    }
}
