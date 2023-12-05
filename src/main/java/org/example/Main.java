package org.example;

import org.example.Classes.*;
import org.example.Classes.Implementation.Warrior;

public class Main {
    public static void main(String[] args) {
        Characters warrior = new Warrior.Builder()
                .health(new Health(120))
                .mana(new Mana(84))
                .armament(new Armament("Excalibur"))
                .physicalSkill(new PhysicalSkill(/* physicalSkill parameters */))
                .magicalSkill(new MagicalSkill(/* magicalSkill parameters */))
                .race(new Race("Elf"))
                .build();

        System.out.println(warrior);

    }
}