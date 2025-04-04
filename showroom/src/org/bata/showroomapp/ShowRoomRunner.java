package org.bata.showroomapp;
import org.bata.showroomapp.manager.Manager;
import org.bata.showroomapp.showroom.ShowRoom;
import org.bata.showroomapp.staff.Staff;
public class ShowRoomRunner {

        public static void main(String[] args) {

            System.out.println("Main started");

            // Creating staff for manager1
            Staff s1 = new Staff();
            s1.id = 101;
            s1.staffName = "Ravi";
            s1.staffAddress = "Bangalore";

            Staff s2 = new Staff();
            s2.id = 102;
            s2.staffName = "Priya";
            s2.staffAddress = "Mysore";

            Staff staffForManager1[] = {s1, s2};

            // Creating manager1
            Manager m1 = new Manager();
            m1.managerName = "Anil";
            m1.staffList = staffForManager1;

            // Creating staff for manager2
            Staff s3 = new Staff();
            s3.id = 103;
            s3.staffName = "Kiran";
            s3.staffAddress = "Hubli";

            Staff s4 = new Staff();
            s4.id = 104;
            s4.staffName = "Sneha";
            s4.staffAddress = "Belgaum";

            Staff staffForManager2[] = {s3, s4};

            // Creating manager2
            Manager m2 = new Manager();
            m2.managerName = "Suresh";
            m2.staffList = staffForManager2;

            // Add managers to showroom
            Manager managersForShowroom[] = {m1, m2};

            ShowRoom showroom = new ShowRoom();
            showroom.showRoomName = "Royal Showroom";
            showroom.location = "MG Road";
            showroom.managers = managersForShowroom;

             //Display all info
            showroom.displayShowRoomInfo();

            System.out.println("Main ended");
        }
    }


