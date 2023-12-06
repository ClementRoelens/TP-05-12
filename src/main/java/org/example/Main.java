package org.example;

import org.example.Classes.*;
import org.example.Classes.Implementations.*;

public class Main {
    public static void main(String[] args) {
        Kingdom kingdom = Kingdom.getInstance();
        Barracks barracks = (Barracks) new Barracks.Builder()
                .style(BuildingStyle.ROCK)
                .build();
        Archery archery = (Archery) new Archery.Builder()
                .style(BuildingStyle.WOOD)
                .build();
        MagicAcademy magicAcademy = (MagicAcademy) new MagicAcademy.Builder()
                .style(BuildingStyle.GOLD)
                .build();

        kingdom.addBuildings(barracks, archery);
        kingdom.addCharacters(
                barracks.createCharacters()
                        .health(new Health(150))
                        .race(new Race("Orc"))
                        .armament(new Armament("Hâche à deux mains"))
                        .build(),
                archery.createCharacters()
                        .health(new Health(100))
                        .race(new Race("Elf"))
                        .armament(new Armament("Arc long"))
                        .build(),
                magicAcademy.createCharacters()
                        .health(new Health(80))
                        .mana(new Mana(50))
                        .magicalSkill(new MagicalSkill("Boule de feu"))
                        .build()
                );
    HCI.selectHeroe(kingdom.getCharacters());

    Warrior warrior = barracks.createCharacters().build();


//        System.out.println(kingdom.getCharacters());
//        for (Characters tempCharac : kingdom.getCharacters()) {
//            for (Characters tempCharacBis : kingdom.getCharacters()) {
//                if (tempCharac != tempCharacBis) {
//                    tempCharacBis.takeDamages(tempCharac.makeDamages(50));
//                }
//            }
//        }
//        System.out.println(kingdom.getCharacters());
    }
}
