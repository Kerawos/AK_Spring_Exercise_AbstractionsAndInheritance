package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritance.models.entities;

/**
 * Defined great hero
 */
public class Jaime extends Tywin {
    private boolean isGood = true;

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }
}
