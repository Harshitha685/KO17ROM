package com.xworkz.steelsystem.steel;

public class SteelRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

//1
        Steel steel1 = new Steel();
        steel1.setSteelId(1);
        steel1.setBrandName("Tata Steel");
        steel1.setWeight("50");
        steel1.setCostPerKg(80.99);
        steel1.setType("Carbon steel");
        steel1.setGrade("A36");
        steel1.setIsCorrosionResistant(false);

        int id1 = steel1.getSteelId();
        String name1 = steel1.getBrandName();
        String weight1 = steel1.getWeight();
        double cost1 = steel1.getCostPerKg();
        String type1 = steel1.getType();
        String grade1 = steel1.getGrade();
        boolean res1 = steel1.getIsCorrosionResistant();

        System.out.println("Steel id is : " +id1);
        System.out.println("Steel brand name is : "+name1);
        System.out.println("Weight of the steel : " +weight1);
        System.out.println("Cost per kg : " +cost1);
        System.out.println("type of steel : " +type1);
        System.out.println("Steel grade is : " +grade1);
        System.out.println("IS corrosive resistant: " +res1);
        System.out.println();

//2
        Steel steel2 = new Steel();
        steel2.setSteelId(2);
        steel2.setBrandName("JSW steel");
        steel2.setWeight("100");
        steel2.setCostPerKg(350.99);
        steel2.setType("Alloy");
        steel2.setGrade("4140");
        steel2.setIsCorrosionResistant(true);

        int id2 = steel2.getSteelId();
        String name2 = steel2.getBrandName();
        String weight2 = steel2.getWeight();
        double cost2 = steel2.getCostPerKg();
        String type2 = steel2.getType();
        String grade2 = steel2.getGrade();
        boolean res2 = steel2.getIsCorrosionResistant();

        System.out.println("Steel id is : " +id2);
        System.out.println("Steel brand name is : "+name2);
        System.out.println("Weight of the steel : " +weight2);
        System.out.println("Cost per kg : " +cost2);
        System.out.println("type of steel : " +type2);
        System.out.println("Steel grade is : " +grade2);
        System.out.println("IS corrosive resistant: " +res2);
        System.out.println();

      //3
        Steel steel3 = new Steel();
        steel3.setSteelId(3);
        steel3.setBrandName("Jindal Steel and Power");
        steel3.setWeight("120");
        steel3.setCostPerKg(1000.00);
        steel3.setType("Stainless steel");
        steel3.setGrade("316");
        steel3.setIsCorrosionResistant(true);

        int id3 = steel3.getSteelId();
        String name3 = steel3.getBrandName();
        String weight3 = steel3.getWeight();
        double cost3 = steel3.getCostPerKg();
        String type3 = steel3.getType();
        String grade3 = steel3.getGrade();
        boolean res3 = steel3.getIsCorrosionResistant();

        System.out.println("Steel id is : " +id3);
        System.out.println("Steel brand name is : "+name3);
        System.out.println("Weight of the steel : " +weight3);
        System.out.println("Cost per kg : " +cost3);
        System.out.println("type of steel : " +type3);
        System.out.println("Steel grade is : " +grade3);
        System.out.println("IS corrosive resistant: " +res3);
        System.out.println();

        //4
        Steel steel4 = new Steel();
        steel4.setSteelId(4);
        steel4.setBrandName("Vedanta.  Steel");
        steel4.setWeight("59");
        steel4.setCostPerKg(5000.99);
        steel4.setType("Stainless steel");
        steel4.setGrade("316");
        steel4.setIsCorrosionResistant(false);

        int id4 = steel4.getSteelId();
        String name4 = steel4.getBrandName();
        String weight4 = steel4.getWeight();
        double cost4 = steel4.getCostPerKg();
        String type4 = steel4.getType();
        String grade4 = steel4.getGrade();
        boolean res4 = steel4.getIsCorrosionResistant();

        System.out.println("Steel id is : " +id4);
        System.out.println("Steel brand name is : "+name4);
        System.out.println("Weight of the steel : " +weight4);
        System.out.println("Cost per kg : " +cost4);
        System.out.println("type of steel : " +type4);
        System.out.println("Steel grade is : " +grade4);
        System.out.println("IS corrosive resistant: " +res4);
        System.out.println();

        //5
        Steel steel5 = new Steel();
        steel5.setSteelId(5);
        steel5.setBrandName("ArcelorMittal Nippon Steel");
        steel5.setWeight("79");
        steel5.setCostPerKg(2000.98);
        steel5.setType("Carbon steel");
        steel5.setGrade("A529");
        steel5.setIsCorrosionResistant(true);

        int id5 = steel5.getSteelId();
        String name5 = steel5.getBrandName();
        String weight5 = steel5.getWeight();
        double cost5 = steel5.getCostPerKg();
        String type5 = steel5.getType();
        String grade5 = steel5.getGrade();
        boolean res5 = steel5.getIsCorrosionResistant();

        System.out.println("Steel id is : " +id5);
        System.out.println("Steel brand name is : "+name5);
        System.out.println("Weight of the steel : " +weight5);
        System.out.println("Cost per kg : " +cost5);
        System.out.println("type of steel : " +type5);
        System.out.println("Steel grade is : " +grade5);
        System.out.println("IS corrosive resistant: " +res5);
        System.out.println();


        System.out.println("Main ended");
    }
}
