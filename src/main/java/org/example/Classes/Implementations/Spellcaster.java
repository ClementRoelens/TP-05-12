package org.example.Classes.Implementations;

import org.example.Classes.Characters;

public class Spellcaster extends Characters {
    protected Spellcaster(Builder builder) {
        super(builder);
        this.name = "Le magicien";
        this.atkValue = 50;
    }

    public void incantate() {
        if (this.isAlive){
            System.out.println("Le magicien marmonne des mots bizarres dans sa barbe");
        }
    }

    @Override
    public int makeDamages() {
        this.incantate();
        return super.makeDamages();
    }

    public static class Builder extends Characters.Builder {
        @Override
        public Spellcaster build() {
            return new Spellcaster(this);
        }

    }
}
