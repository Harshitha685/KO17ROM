package com.xworkz.lipstickapp.lipstick;

import netscape.security.UserTarget;

public class LipStick {

    int lipStickId;
    String lipStickBrand;
    String lipStickColor;
    String lipStickType;
    double price;


     public void setLipStickId(int lipStickId){
         this.lipStickId = lipStickId;
     }

     public int getLipStickId(){
         return lipStickId;
     }

     public void setLipStickBrand(String lipStickBrand){
         this.lipStickBrand = lipStickBrand;
     }
     public  String getLipStickBrand(){
         return lipStickBrand;
     }

     public void setLipStickColor(String lipStickColor){
         this.lipStickColor = lipStickColor;
     }

    public String getLipStickColor() {
        return lipStickColor;
    }

    public void setLipStickType(String lipStickType){
         this.lipStickType = lipStickType;
    }

    public String getLipStickType() {
        return lipStickType;
    }

    public void setPrice(double price){
         this.price = price;
    }

    public double getPrice() {
        return price;
    }



}
