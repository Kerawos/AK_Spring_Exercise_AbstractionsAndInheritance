package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritance.models.entities;

/**
 * Defined great hero (*not)
 */
public class Joffrey extends Jaime {
    private boolean isGood = false;

    @Override
    public boolean isGood() {
        return isGood;
    }

    @Override
    public void setGood(boolean good) {
        isGood = good;
    }
}
