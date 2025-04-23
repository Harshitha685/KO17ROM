package com.xworkz.objectmethodtask.tool;

public class ToolRunner {

        public static void main(String[] args) {

            ToolDto tool = new ToolDto();

            tool.setToolName("Drill Machine");
            tool.setToolType("Electric");
            tool.setWeight(3.5);
            tool.setElectric(true);
            tool.setBrand("Bosch");

            System.out.println(tool);
        }
    }


