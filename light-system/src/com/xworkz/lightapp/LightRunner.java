package com.xworkz.lightapp;

import com.xworkz.lightapp.swi.Cfl;
import com.xworkz.lightapp.swi.Switch;
import com.xworkz.lightapp.swi.TubeLight;

public class LightRunner {

    public static void main(String[] args) {
        
    Switch aSwitch = new TubeLight();

     aSwitch.on();
     aSwitch.off();
     aSwitch.threeWay();


     Switch bSwitch = new Cfl();
     bSwitch.on();
     bSwitch.off();
     bSwitch.threeWay();
}}
