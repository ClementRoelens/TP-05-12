package org.example.Classes.Implementations;

import org.example.Classes.*;

public class Barracks extends Building {
    private Barracks(BuildingBuilder builder) {
        super(builder);
        this.name = "Caserne de pompier";
    }

    @Override
    public Warrior.Builder createCharacters() {
        return new Warrior.Builder();
    }

    public static class Builder extends BuildingBuilder {

        @Override
        public Barracks build() {
            return new Barracks(this);
        }


    }
}
