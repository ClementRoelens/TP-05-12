package org.example.Classes.Implementations;

import org.example.Classes.Building;
import org.example.Classes.BuildingBuilder;
import org.example.Classes.Characters;

public class MagicAcademy extends Building {
    private MagicAcademy(BuildingBuilder builder){
        super(builder);
        this.name = "École de magie";
    }

    public void misspell(int spellcastersNumber){
        if (spellcastersNumber > 5){
            this.structuralDamages -= 10;
            System.out.println("Trop de mages ensemble, un incident est arrivé.\nL'école de magie prend 10 points de dommages structurels");
        }
    }

    @Override
    public Spellcaster.Builder createCharacters() {
        if (!this.isDestroyed){
            return new Spellcaster.Builder();
        }
        System.out.println("L'école de magie a été détruite. Vous ne pouvez plus créer de mage");
        return null;
    }

    public static class Builder extends BuildingBuilder{

        @Override
        public MagicAcademy build() {
            return new MagicAcademy(this);
        }
    }
}
