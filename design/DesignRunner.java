package com.xworkz.objectmethodtask.design;

public class DesignRunner {

        public static void main(String[] args) {

            DesignDto design = new DesignDto();

            design.setDesignName("Modern Living Room");
            design.setDesignerName("Alice Johnson");
            design.setDesignType("Interior Design");
            design.setDesignPrice(1500.75);
            design.setCustomDesign(true);

            System.out.println(design);
        }
    }


