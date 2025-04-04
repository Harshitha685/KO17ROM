package com.apple.gymapp;

import com.apple.gymapp.gym.Gym;
import com.apple.gymapp.members.Member;
import com.apple.gymapp.training.Trainer;

    public class GymRunner {
        public static void main(String[] args) {
            System.out.println("Main started");

            // Create trainers
            Trainer t1 = new Trainer();
            t1.name = "Arun";
            t1.salary = 30000;

            Trainer t2 = new Trainer();
            t2.name = "Sneha";
            t2.salary = 35000;

            Trainer trainerList[] = {t1, t2};

            // Create members
            Member m1 = new Member();
            m1.name = "Rahul";
            m1.goal = "Weight Loss";

            Member m2 = new Member();
            m2.name = "Priya";
            m2.goal = "Muscle Gain";

            Member memberList[] = {m1, m2};

            // Create gym
            Gym gym = new Gym();
            gym.name = "FitZone";
            gym.location = "BTM Layout";
            gym.trainers = trainerList;
            gym.members = memberList;

            // Display all info
            gym.displayGymInfo();

            System.out.println("Main ended");
        }
    }


