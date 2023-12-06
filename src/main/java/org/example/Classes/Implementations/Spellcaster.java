package org.example.Classes.Implementations;

import org.example.Classes.Characters;

public class Spellcaster extends Characters {
    protected Spellcaster(Builder builder) {
        super(builder);
        Incantate();
    }
    public void Incantate(){
        System.out.println("Le magicien parle dans sa barbe pour lancer des sorts mega badass.");
    }
    public static class Builder extends Characters.Builder{
        @Override
        public Spellcaster build(){
            return new Spellcaster(this);
        }
    }
}
