package org.example.Classes.Implementations;

import org.example.Classes.Characters;

public class Spellcaster extends Characters {
    protected Spellcaster(Builder builder) {
        super(builder);
    }

    public static class Builder extends Characters.Builder{
        @Override
        public Spellcaster build(){
            return new Spellcaster(this);
        }
    }
}
