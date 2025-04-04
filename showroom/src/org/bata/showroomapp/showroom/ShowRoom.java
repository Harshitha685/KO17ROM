package org.bata.showroomapp.showroom;
import org.bata.showroomapp.manager.Manager;
public class ShowRoom {

        public String showRoomName;
        public String location;
        public Manager managers[];

        public void displayShowRoomInfo() {
            System.out.println("Showroom Name: " + showRoomName);
            System.out.println("Location: " + location);
            System.out.println("Managers:");
            for (Manager manager : managers) {
                manager.displayManagerInfo();
            }
        }
    }


