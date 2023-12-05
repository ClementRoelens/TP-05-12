package org.example.Classes;

public class Mana {
    int manaAmount;
    public Mana(int manaAmount) {
        this.manaAmount = manaAmount;
    }

    @Override
    public String toString() {
        return "Mana{" +
                "manaAmount=" + manaAmount +
                '}';
    }
}
