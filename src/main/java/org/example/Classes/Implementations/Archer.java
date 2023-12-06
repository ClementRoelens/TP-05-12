package org.example.Classes.Implementations;

import org.example.Classes.Characters;

public class Archer extends Characters {
    protected Archer(Builder builder) {
        super(builder);
    }

    public static class Builder extends Characters.Builder{
        @Override
        public Archer build(){
            return new Archer(this);
        }
    }
}
