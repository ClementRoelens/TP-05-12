package org.example.Classes;

public abstract class Building {
    private final int id;
    private static int count;
    protected String name;
    private BuildingStyle style;
    private int size;
    private int trainingTime;
    private int buildingTime;
    private int structuralDamages;
    private boolean hasRoof;


    protected Building(BuildingBuilder builder) {
        this.id = count++;
        this.style = builder.getStyle();
        this.size = builder.getSize();
        this.trainingTime = builder.getTrainingTime();
        this.buildingTime = builder.getBuildingTime();
        this.structuralDamages = 0;
        this.hasRoof = builder.isHasRoof();
    }

    private int getId() {
        return id;
    }

    private static int getCount() {
        return count;
    }

    private String getName() {
        return name;
    }

    private BuildingStyle getStyle() {
        return style;
    }

    private int getSize() {
        return size;
    }

    private int getTrainingTime() {
        return trainingTime;
    }

    private int getBuildingTime() {
        return buildingTime;
    }

    private int getStructuralDamages() {
        return structuralDamages;
    }

    private boolean isHasRoof() {
        return hasRoof;
    }


    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", style=" + style +
                ", size=" + size +
                ", trainingTime=" + trainingTime +
                ", buildingTime=" + buildingTime +
                ", structuralDamages=" + structuralDamages +
                ", hasRoof=" + hasRoof +
                '}';
    }
}
