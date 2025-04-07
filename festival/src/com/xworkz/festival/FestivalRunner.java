package com.xworkz.festival;

import com.xworkz.festival.fest.Festival;

public class FestivalRunner {

        public static void main(String[] args) {

            Festival ref1 = new Festival();
            ref1.setName("Diwali");
            ref1.setMonth("November");
            ref1.setDuration(5);
            ref1.setIsNational(true);
            ref1.setMainActivity("Lighting Diyas");
            ref1.setIsReligious(true);
            ref1.setFamousFood("Sweets");

            String name1 = ref1.getName();
            String month1 = ref1.getMonth();
            int duration1 = ref1.getDuration();
            boolean national1 = ref1.getIsNational();
            String activity1 = ref1.getMainActivity();
            boolean religious1 = ref1.getIsReligious();
            String food1 = ref1.getFamousFood();

            System.out.println("Festival Name        : " + name1);
            System.out.println("Festival Month       : " + month1);
            System.out.println("Duration (days)      : " + duration1);
            System.out.println("Is National Festival : " + national1);
            System.out.println("Main Activity        : " + activity1);
            System.out.println("Is Religious         : " + religious1);
            System.out.println("Famous Food          : " + food1);
            System.out.println();

            Festival ref2 = new Festival();
            ref2.setName("Christmas");
            ref2.setMonth("December");
            ref2.setDuration(1);
            ref2.setIsNational(false);
            ref2.setMainActivity("Decorating Tree");
            ref2.setIsReligious(true);
            ref2.setFamousFood("Cake");

            String name2 = ref2.getName();
            String month2 = ref2.getMonth();
            int duration2 = ref2.getDuration();
            boolean national2 = ref2.getIsNational();
            String activity2 = ref2.getMainActivity();
            boolean religious2 = ref2.getIsReligious();
            String food2 = ref2.getFamousFood();

            System.out.println("Festival Name        : " + name2);
            System.out.println("Festival Month       : " + month2);
            System.out.println("Duration (days)      : " + duration2);
            System.out.println("Is National Festival : " + national2);
            System.out.println("Main Activity        : " + activity2);
            System.out.println("Is Religious         : " + religious2);
            System.out.println("Famous Food          : " + food2);
            System.out.println();

            Festival ref3 = new Festival();
            ref3.setName("Holi");
            ref3.setMonth("March");
            ref3.setDuration(2);
            ref3.setIsNational(true);
            ref3.setMainActivity("Playing with colors");
            ref3.setIsReligious(true);
            ref3.setFamousFood("Gujiya");

            String name3 = ref3.getName();
            String month3 = ref3.getMonth();
            int duration3 = ref3.getDuration();
            boolean national3 = ref3.getIsNational();
            String activity3 = ref3.getMainActivity();
            boolean religious3 = ref3.getIsReligious();
            String food3 = ref3.getFamousFood();

            System.out.println("Festival Name        : " + name3);
            System.out.println("Festival Month       : " + month3);
            System.out.println("Duration (days)      : " + duration3);
            System.out.println("Is National Festival : " + national3);
            System.out.println("Main Activity        : " + activity3);
            System.out.println("Is Religious         : " + religious3);
            System.out.println("Famous Food          : " + food3);
            System.out.println();

            Festival ref4 = new Festival();
            ref4.setName("Eid");
            ref4.setMonth("Varies");
            ref4.setDuration(1);
            ref4.setIsNational(false);
            ref4.setMainActivity("Offering prayers");
            ref4.setIsReligious(true);
            ref4.setFamousFood("Biryani");

            String name4 = ref4.getName();
            String month4 = ref4.getMonth();
            int duration4 = ref4.getDuration();
            boolean national4 = ref4.getIsNational();
            String activity4 = ref4.getMainActivity();
            boolean religious4 = ref4.getIsReligious();
            String food4 = ref4.getFamousFood();

            System.out.println("Festival Name        : " + name4);
            System.out.println("Festival Month       : " + month4);
            System.out.println("Duration (days)      : " + duration4);
            System.out.println("Is National Festival : " + national4);
            System.out.println("Main Activity        : " + activity4);
            System.out.println("Is Religious         : " + religious4);
            System.out.println("Famous Food          : " + food4);
            System.out.println();

            Festival ref5 = new Festival();
            ref5.setName("RamNavami");
            ref5.setMonth("April");
            ref5.setDuration(1);
            ref5.setIsNational(false);
            ref5.setMainActivity("Chanting Mantras");
            ref5.setIsReligious(true);
            ref5.setFamousFood("Panaka");

            String name5 = ref5.getName();
            String month5 = ref5.getMonth();
            int duration5 = ref5.getDuration();
            boolean national5 = ref5.getIsNational();
            String activity5 = ref5.getMainActivity();
            boolean religious5 = ref5.getIsReligious();
            String food5 = ref5.getFamousFood();

            System.out.println("Festival Name        : " + name5);
            System.out.println("Festival Month       : " + month5);
            System.out.println("Duration (days)      : " + duration5);
            System.out.println("Is National Festival : " + national5);
            System.out.println("Main Activity        : " + activity5);
            System.out.println("Is Religious         : " + religious5);
            System.out.println("Famous Food          : " + food5);
            System.out.println();
        }
    }



