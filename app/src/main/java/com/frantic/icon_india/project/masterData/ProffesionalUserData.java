package com.ankur.taskapp.manager.masterData;

/**
 * Created by Ankur_ on 2/16/2018.
 */

public class ProffesionalUserData {
    String total_project,total_task,attendance;

    public String getTotal_project() {
        return total_project;
    }

    public void setTotal_project(String total_project) {
        this.total_project = total_project;
    }

    public String getTotal_task() {
        return total_task;
    }

    public void setTotal_task(String total_task) {
        this.total_task = total_task;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public ProffesionalUserData(String total_project, String total_task, String attendance)
    {
        this.total_project=total_project;
        this.total_task=total_task;
        this.attendance=attendance;

    }
}
