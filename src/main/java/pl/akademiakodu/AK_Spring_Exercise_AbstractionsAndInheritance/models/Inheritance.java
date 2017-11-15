package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritance.models;

import pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritance.models.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Inheritance {

    private List<Human> heroes;

    public List<Human> getHeroes() {
        return heroes;
    }

    public Inheritance() {
        heroes = new ArrayList<>();
        heroes.add(new Eddard());
        heroes.add(new Rob());
        heroes.add(new Tywin());
        heroes.add(new Tyrion());
        heroes.add(new Jaime());
        heroes.add(new Joffrey());
        heroes.add(new Tommen());
        heroes.add(new Aerys());
        heroes.add(new Rhaegar());
        heroes.add(new Jon());
    }


    public String isDescendant(String ancestorName, String descendantName){
        if (!isCorrectName(ancestorName, descendantName)){
            return "We do not have typed heroes in our database..";
        }
        if (ancestorName.equals(descendantName)){
            return "You entered same heroes";
        }
        Class Ancestor;
        Class Descendant;
        for (Human hero : heroes) {
            if (hero.getClass().getName().substring(hero.getClass().getName().lastIndexOf(".") + 1).equals(ancestorName)){
                Ancestor = hero.getClass();
                for (Human human : heroes) {
                    if (human.getClass().getName().substring(human.getClass().getName().lastIndexOf(".") + 1).equals(descendantName)){
                        Descendant = human.getClass();
                        if(Ancestor.isAssignableFrom(Descendant)){
                            return descendantName + " inheritance from " + ancestorName;
                        }
                    }
                }
            }
        }
        return "Unfortunately " + descendantName + " do not inheritance from " + ancestorName;
    }

    public boolean isCorrectName(String ancestorName, String descendantName){
        boolean aName = false;
        boolean dName = false;
        for (Human hero : heroes) {
            if (hero.getClass().getName().substring(hero.getClass().getName().lastIndexOf(".") + 1).equals(ancestorName)){
                aName = true;
            }
            if (hero.getClass().getName().substring(hero.getClass().getName().lastIndexOf(".") + 1).equals(descendantName)){
                dName = true;
            }
        }
        if (!aName || !dName){
            return false;
        }
        return true;
    }

    public String getHeroesNames(){
        StringBuilder sb = new StringBuilder();
        for (Human hero : getHeroes()) {
            sb.append(hero.getClass().getName().substring(hero.getClass().getName().lastIndexOf(".") + 1) + ", ");
        }
        return sb.toString();
    }

}

/*
        Eddard eddard = new Eddard();
        Rob rob = new Rob();
        Tywin tywin = new Tywin();
        Tyrion tyrion = new Tyrion();
        Jaime jaimie = new Jaime();
        Joffrey joffrey = new Joffrey();
        Tommen tommen = new Tommen();
        Aerys aerys = new Aerys();
        Rhaegar rhaegar = new Rhaegar();
        Jon jon = new Jon();

    Human eddard = new Eddard();
    Stark rob = new Rob();
    Human tywin = new Tywin();
    Tywin tyrion = new Tyrion();
    Lannister jaimie = new Jaime();
    Jaime joffrey = new Joffrey();
    Tywin tommen = new Tommen();
    Human aerys = new Aerys();
    Targaryen rhaegar = new Rhaegar();
    Rhaegar jon = new Jon();
 */
