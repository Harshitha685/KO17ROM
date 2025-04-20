package com.xworkz.methodoverriding.tool;

public class ToolRunner {

        public static void main(String[] args) {
            Tool tool = new Tool();
            tool.use();
            tool.maintain();
            tool.store();
            tool.inspect();
            System.out.println();

            Tool gt = new GardeningTool();
            gt.use();
            gt.maintain();
            gt.store();
            gt.inspect();
            System.out.println();

            GardeningTool garden = new GardeningTool();
            garden.use();
            garden.maintain();
            garden.store();
            garden.inspect();
            garden.waterPlants(); // Extra method
        }
    }


