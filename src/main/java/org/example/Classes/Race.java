package org.example.Classes;

public class Race {

    String raceName;
    public Race(String raceName) {
        this.raceName = raceName;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceName='" + raceName + '\'' +
                '}';
    }
}
