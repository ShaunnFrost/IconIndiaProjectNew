package com.ankur.taskapp.manager.masterData;

/**
 * Created by Ankur_ on 3/7/2018.
 */

public class DailyAttendanceData {
    String attendance_id;
    String checkin;
    String checkout;
    String break_start;
    String break_end;
    String employee_name;
    String employee_id;
    String employee_image;
    public DailyAttendanceData(String attendance_id, String checkin, String checkout, String break_start,
                               String break_end, String employee_name, String employee_id, String employee_image)
    {
        this.attendance_id=attendance_id;
        this.checkin=checkin;
        this.checkout=checkout;
        this.break_start=break_start;
        this.break_end=break_end;
        this.employee_name=employee_name;

        this.employee_id=employee_id;
        this.employee_image=employee_image;
    }
    public String getAttendance_id() {
        return attendance_id;
    }

    public void setAttendance_id(String attendance_id) {
        this.attendance_id = attendance_id;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getBreak_start() {
        return break_start;
    }

    public void setBreak_start(String break_start) {
        this.break_start = break_start;
    }

    public String getBreak_end() {
        return break_end;
    }

    public void setBreak_end(String break_end) {
        this.break_end = break_end;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_image() {
        return employee_image;
    }

    public void setEmployee_image(String employee_image) {
        this.employee_image = employee_image;
    }


}
