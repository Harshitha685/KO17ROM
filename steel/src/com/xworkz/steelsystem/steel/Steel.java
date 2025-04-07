package com.xworkz.steelsystem.steel;

public class Steel {

   private int steelId;
   private String brandName;
   private String weight;
   private double costPerKg;
   private String type;
   private String grade;
   private boolean isCorrosionResistant;

   public void setSteelId(int steelId){
      this.steelId = steelId;
   }

   public int getSteelId(){
      return steelId;
   }

   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   public String getBrandName() {
      return brandName;
   }

   public void setWeight(String weight){
      this.weight = weight;
   }
   public String getWeight(){
      return weight;
   }

   public void setCostPerKg(double costPerKg){
      this.costPerKg = costPerKg;
   }
   public double getCostPerKg(){
      return  costPerKg;
   }

   public void setType(String type){
      this.type = type;
   }
   public String getType(){
      return type;
   }

   public void setGrade(String grade){
      this.grade = grade;
   }
   public String getGrade(){
      return grade;
   }

   public void setIsCorrosionResistant(boolean isCorrosionResistant) {
      this.isCorrosionResistant = isCorrosionResistant;
   }

   public boolean getIsCorrosionResistant() {
      return isCorrosionResistant;
   }
}
