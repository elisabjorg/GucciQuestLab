package GucciQuest.Players.Spellcasters;

import GucciQuest.*;
import GucciQuest.Players.Player;

import java.util.ArrayList;

public class Warlock extends Player {

    private ArrayList<Creatures> creatures;
    private ArrayList<Spells> spells;

    public Warlock(String name, int health, ArrayList<Weapons> weapons, ArrayList<Armours> armours, ArrayList<Treasures> bag, ArrayList<Creatures> creatures, ArrayList<Spells> spells) {
        super(name, health, weapons, armours, bag);
        this.creatures = creatures;
        this.spells = spells;
    }

}
