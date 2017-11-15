package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritance.models.entities;

public class Jon extends Rhaegar implements HouseMotto{
    @Override
    public String getMotto(){
        return "I know nothing";
    }

}
