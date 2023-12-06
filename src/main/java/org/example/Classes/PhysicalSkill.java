package org.example.Classes;

public class PhysicalSkill {

    String physicalSkill;
    public PhysicalSkill(String physicalSkill) {
        this.physicalSkill = physicalSkill;
    }

    @Override
    public String toString() {
        return "PhysicalSkill{" +
                "physicalSkill=" + physicalSkill +
                '}';
    }
}