package org.bata.showroomapp.manager;
import org.bata.showroomapp.staff.Staff;

public class Manager {

        public String managerName;
        public Staff staffList[];

        public void displayManagerInfo() {
            System.out.println("Manager Name: " + managerName);
            System.out.println("Staff under this manager:");
            for (Staff staff : staffList) {
                staff.displayStaffInfo();
            }

    }

}
