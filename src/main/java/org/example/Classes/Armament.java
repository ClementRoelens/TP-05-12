package org.example.Classes;

public class Armament {

    String armamentName;
    public Armament(String armamentName) {
        this.armamentName = armamentName;
    }

    @Override
    public String toString() {
        return "Armament{" +
                "armamentName='" + armamentName + '\'' +
                '}';
    }
}
