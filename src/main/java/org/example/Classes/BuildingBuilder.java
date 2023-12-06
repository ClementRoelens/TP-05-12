package org.example.Classes;

public abstract class BuildingBuilder {
    private BuildingStyle style;
    private int size;
    private int trainingTime;
    private int buildingTime;
    private boolean hasRoof;


    protected BuildingStyle getStyle() {
        return style;
    }

    protected int getSize() {
        return size;
    }

    protected int getTrainingTime() {
        return trainingTime;
    }

    protected int getBuildingTime() {
        return buildingTime;
    }

    protected boolean isHasRoof() {
        return hasRoof;
    }

    public BuildingBuilder style(BuildingStyle style) {
        this.style = style;
        return this;
    }

    public BuildingBuilder size(int size) {
        this.size = size;
        return this;
    }

    public BuildingBuilder trainingTime(int trainingTime) {
        this.trainingTime = trainingTime;
        return this;
    }

    public BuildingBuilder buildingTime(int buildingTime) {
        this.buildingTime = buildingTime;
        return this;
    }

    public BuildingBuilder hasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
        return this;
    }


    public abstract Building build();

}