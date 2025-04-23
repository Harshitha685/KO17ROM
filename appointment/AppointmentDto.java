package com.xworkz.objectmethodtask.appointment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentDto {
        private String patientName;
        private String doctorName;
        private String date;
        private String time;
        private String department;

        @Override
        public String toString() {
            return "AppointmentDto = (" +
                    "patientName = " + this.patientName + "," +
                    "\ndoctorName = " + this.doctorName + "," +
                    "\ndate = " + this.date + "," +
                    "\ntime = " + this.time + "," +
                    "\ndepartment = " + this.department + ")";
        }
    }


