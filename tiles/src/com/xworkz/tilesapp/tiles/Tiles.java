package com.xworkz.tilesapp.tiles;

public class Tiles {

    private String tileType;
    private String originCountry;
    private String surfaceFinish;
    private double thickness;
    private double weightPerTile;
    private double costPerBox;
    private boolean isSlipResistant;

    public void setTileType(String tileType) {
        this.tileType = tileType;
    }

    public String getTileType() {
        return tileType;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setSurfaceFinish(String surfaceFinish) {
        this.surfaceFinish = surfaceFinish;
    }

    public String getSurfaceFinish() {
        return surfaceFinish;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

    public void setWeightPerTile(double weightPerTile) {
        this.weightPerTile = weightPerTile;
    }

    public double getWeightPerTile() {
        return weightPerTile;
    }

    public void setCostPerBox(double costPerBox) {
        this.costPerBox = costPerBox;
    }

    public double getCostPerBox() {
        return costPerBox;
    }

    public void setIsSlipResistant(boolean isSlipResistant) {
        this.isSlipResistant = isSlipResistant;
    }

    public boolean getIsSlipResistant() {
        return isSlipResistant;
    }
}

