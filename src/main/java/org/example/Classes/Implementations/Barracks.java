package org.example.Classes.Implementations;

import org.example.Classes.*;

public class Barracks extends Building {
    private Barracks(BuildingBuilder builder) {
        super(builder);
        this.name = "Caserne";
    }

    public boolean hasBrawlHappened(int warriorsNumber){
        return warriorsNumber >= 3;
    }

    @Override
    public Warrior.Builder createCharacters() {
        if (!this.isDestroyed){
            return new Warrior.Builder();
        }
        System.out.println("La caserne a été détruite, vous ne pouvez plus créer de guerrier");
        return null;
    }

    public static class Builder extends BuildingBuilder {

        @Override
        public Barracks build() {
            return new Barracks(this);
        }


    }
}
