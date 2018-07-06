package com.ankur.taskapp.manager.masterData;

/**
 * Created by Ankur_ on 3/15/2018.
 */

public class MonthlyAttendanceData {

    String percentage;
    String late;
    String overtime;
    String leave;
    String absent;
    String employee_name;
    String employee_id;
    String employee_image;

    public MonthlyAttendanceData(String percentage, String late, String overtime, String leave,
                                 String absent, String employee_name, String employee_id, String employee_image)
    {
        this.percentage=percentage;
        this.late=late;
        this.overtime=overtime;
        this.leave=leave;
        this.absent=absent;
        this.employee_name=employee_name;
        this.employee_id=employee_id;
        this.employee_image=employee_image;
    }
    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave;
    }

    public String getAbsent() {
        return absent;
    }

    public void setAbsent(String absent) {
        this.absent = absent;
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
