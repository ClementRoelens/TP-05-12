package org.example.Classes.Implementations;

import org.example.Classes.Building;
import org.example.Classes.BuildingBuilder;
import org.example.Classes.Characters;

public class MagicAcademy extends Building {
    private MagicAcademy(BuildingBuilder builder){
        super(builder);
        this.name = "École de magie Poitiers";
    }

    @Override
    public Spellcaster.Builder createCharacters() {
        return new Spellcaster.Builder();
    }

    public static class Builder extends BuildingBuilder{

        @Override
        public MagicAcademy build() {
            return new MagicAcademy(this);
        }
    }
}
