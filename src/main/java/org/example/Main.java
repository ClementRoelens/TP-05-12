package org.example;

import org.example.Classes.*;
import org.example.Classes.Implementations.Barracks;
import org.example.Classes.Implementations.Warrior;

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
        Characters warrior = barracks.createCharacters()
                .physicalSkill(new PhysicalSkill("Endurance et force"))
                .race(new Race("Orc"))
                .armament(new Armament("Hâche à deux mains"))
                .build();
        System.out.println(warrior);
        System.out.println(warrior instanceof Warrior);
    }
}