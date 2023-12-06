package org.example;

import org.example.Classes.*;
import org.example.Classes.Implementations.*;

public class Main {
    public static void main(String[] args) {

        Building barracks = new Barracks.Builder()
                .buildingTime(30)
                .size(5)
                .trainingTime(10)
                .hasRoof(true)
                .style(BuildingStyle.ROCK)
                .build();
        System.out.println(barracks);
        System.out.println(barracks instanceof Barracks);


        Building archery = new Archery.Builder()
                .buildingTime(30)
                .size(5)
                .trainingTime(10)
                .hasRoof(true)
                .style(BuildingStyle.GOLD)
                .build();
        System.out.println(archery);
        System.out.println(archery instanceof Archery);

        Building magicAcademy = new MagicAcademy.Builder()
                .buildingTime(30)
                .size(5)
                .trainingTime(10)
                .hasRoof(true)
                .style(BuildingStyle.WOOD)
                .build();
        System.out.println(magicAcademy);
        System.out.println(magicAcademy instanceof MagicAcademy);

        Warrior warrior = (Warrior) barracks.createCharacters()
                .physicalSkill(new PhysicalSkill("Endurance et force"))
                .race(new Race("Orc"))
                .armament(new Armament("Hâche à deux mains"))
                .build();
        Archer archer = (Archer) archery.createCharacters()
                        .physicalSkill(new PhysicalSkill("flèche empoisonnée")).build();

        Spellcaster spellcaster = (Spellcaster) magicAcademy.createCharacters()
                .magicalSkill(new MagicalSkill("Désintégration par la lumiere")).build();


        System.out.println(warrior);
        System.out.println(archer);
        System.out.println(spellcaster);
    }
}